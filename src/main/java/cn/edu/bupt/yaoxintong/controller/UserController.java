package cn.edu.bupt.yaoxintong.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.bupt.yaoxintong.componet.PasswordHelper;
import cn.edu.bupt.yaoxintong.componet.PasswordHelper.PasswordAndSalt;
import cn.edu.bupt.yaoxintong.pojo.ContactInformation;
import cn.edu.bupt.yaoxintong.pojo.LoginToken;
import cn.edu.bupt.yaoxintong.pojo.YaoxintongUser;
import cn.edu.bupt.yaoxintong.response.model.UserInfo;
import cn.edu.bupt.yaoxintong.service.ContactInformationService;
import cn.edu.bupt.yaoxintong.service.LoginTokenService;
import cn.edu.bupt.yaoxintong.service.UserService;
import cn.edu.bupt.yaoxintong.util.Constant;
import cn.edu.bupt.yaoxintong.util.ReturnModel;
import cn.edu.bupt.yaoxintong.util.StringUtil;

/**
 * @author 作者wydewy
 * @version 创建时间：2017年7月21日 下午8:07:01
 * 
 *          类说明 用户控制器
 */
@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	UserService userService;
	@Autowired
	LoginTokenService loginTokenService;
	@Autowired
	ContactInformationService contactInformationService;

	@Autowired
	PasswordHelper passwordHelper;

	/**
	 * @author 作者wydewy 接口名称：用户注册
	 * @param username
	 * @param email
	 * @param phone
	 * @param password
	 * @param request
	 * @param sex
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public @ResponseBody ReturnModel register(String username, String email, String phone, String password,
			@RequestParam(value = "sex", required = false) String sex, HttpServletResponse response,
			HttpServletRequest request) {

		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");

		logger.info("======进入了UserController的/register方法，参数：username = " + username + " email = " + email + " phone = "
				+ phone + " password = " + password + " sex = " + sex);

		ReturnModel result = new ReturnModel();

		if (StringUtil.isEmpty(username)) {
			result.setResult(false);
			if (Constant.DEBUG) {
				result.setReason(Constant.REASON_USERNAME_IS_NULL);
			} else {
				result.setReason(Constant.REASON_UNKNOW);
			}

			return result;
		}
		if (StringUtil.isEmpty(password)) {
			result.setResult(false);
			if (Constant.DEBUG) {
				result.setReason(Constant.REASON_PASSWORD_IS_NULL);
			} else {
				result.setReason(Constant.REASON_UNKNOW);
			}

			return result;
		}

		// 验证是否该用户已经注册
		YaoxintongUser user = userService.getUserByUsername(username);
		// case already registered
		if (user != null) {
			result.setResult(false);
			result.setReason(Constant.REASON_USERNAME_IS_EXIST);
			return result;
		}

		PasswordAndSalt encryptPassword = passwordHelper.encryptPassword(password);

		// 设置用户信息
		user = new YaoxintongUser();
		String userId = UUID.randomUUID().toString();
		user.setId(userId);
		user.setUsername(username);
		user.setPassword(encryptPassword.getPassword());// 密码加密
		user.setSalt(encryptPassword.getSalt());
		user.setRegisterTime(new Date());

		if (StringUtil.isEmpty(sex)) {
			user.setSex(Constant.SEX_UNKNOWN);
		} else {
			user.setSex(sex);
		}

		int i1 = 0, i2 = 0;
		// 添加邮箱信息
		if (!StringUtil.isEmpty(email)) {
			i1 = insertContactInfo(email, userId, Constant.CONTACT_INFO_TYPE_EMAIL);

		}
		// 添加手机号码
		if (!StringUtil.isEmpty(phone)) {
			i2 = insertContactInfo(phone, userId, Constant.CONTACT_INFO_TYPE_PHONE);
		}

		int i = userService.addUser(user);
		result.setResult(i > 0);

		Map<String, Object> datum = new HashMap<String, Object>();
		datum.put("userId", userId);

		datum.put("email", (i1 > 0) ? Constant.STRING_TRUE : Constant.STRING_FALSE);
		datum.put("phone", (i2 > 0) ? Constant.STRING_TRUE : Constant.STRING_FALSE);
		result.setDatum(datum);

		return result;
	}

	private int insertContactInfo(String info, String userId, String type) {
		int i1;
		ContactInformation information = new ContactInformation();
		information.setUserId(userId);
		information.setContactInfo(info);
		information.setContactType(Constant.CONTACTTYPE_USER);
		information.setType(type);
		information.setUpdateTime(new Date());
		information.setVerified(0);
		i1 = contactInformationService.addContactInformation(information);
		return i1;
	}

	/**
	 * 用户登录
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody ReturnModel login(String username, String password, HttpServletResponse response,
			HttpServletRequest request) {
		ReturnModel result = new ReturnModel();

		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");

		YaoxintongUser userByUsername = userService.getUserByUsername(username);
		if (userByUsername == null) {
			result.setResult(false);
			result.setReason(Constant.REASON_USER_NOT_EXIST);
			return result;
		}
		if (StringUtil.isEmpty(password)) {
			result.setResult(false);
			result.setReason(Constant.REASON_PASSWORD_IS_NULL);
			return result;
		}

		String decryptPassword = passwordHelper.encryptPassword(password, userByUsername.getSalt());

		String originPassword = userByUsername.getPassword();
		if (StringUtil.isEmpty(originPassword)) {
			result.setResult(false);
			result.setReason(Constant.REASON_PASSWORD_NOT_EXIST);
			return result;
		} else {
			if (originPassword.equals(decryptPassword)) {
				LoginToken loginToken = new LoginToken();
				loginToken.setStatus("1");
				loginToken.setUserid(userByUsername.getId());
				loginToken.setToken(UUID.randomUUID().toString());
				loginToken.setCreateTime(new Date());
				loginToken.setStatus(Constant.LOGIN_TOKEN_STATUS_VALID);
				int i = loginTokenService.addLoginToken(loginToken);
				if (i > 0) {
					result.setResult(true);
					result.setDatum(loginToken);
				} else {
					result.setResult(false);
					result.setReason(Constant.LOGIN_FAILED);
				}

			} else {
				result.setResult(false);
				result.setReason(Constant.LOGIN_FAILED_PASSWORD_ERROR);
			}
		}
		return result;
	}

	/**
	 * 查询用户数据
	 * 
	 * @param token
	 *            登录令牌
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/info", method = RequestMethod.POST)
	public @ResponseBody ReturnModel userInfo(String token, HttpServletResponse response, HttpServletRequest request) {

		logger.info("======进入了UserController的/userInfo方法，参数：token = " + token);

		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");
		
		
		ReturnModel result = new ReturnModel();

		if (StringUtil.isEmpty(token)) {
			result.setResult(false);
			result.setReason(Constant.REASON_TOKEN_IS_NULL);
			return result;
		}

		if(!loginTokenService.isTokenValid(token)){
			result.setResult(false);
			result.setReason(Constant.REASON_TOKEN_IS_INVALIID);
			return result;
		}
		
		LoginToken loginToken = loginTokenService.getLoginTokenByToken(token);
		if (loginToken != null & Constant.LOGIN_TOKEN_STATUS_VALID.equals(loginToken.getStatus())) {
			String userId = loginToken.getUserid();
			if (userId != null) {
				YaoxintongUser user = userService.getUser(userId);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				List<ContactInformation> contactInformation = contactInformationService.getContactInfomation(userId);
				UserInfo userinfo = new UserInfo();
				userinfo.setBirthday(sdf.format(user.getBirthday()));
				userinfo.setContactInformation(contactInformation);
				userinfo.setUser(user);
				result.setDatum(userinfo);
				result.setResult(true);
			} else {
				result.setResult(false);
				result.setReason(Constant.REASON_USER_NOT_EXIST);
			}
		} else {
			result.setResult(false);
			result.setReason(Constant.REASON_LOGIN_TOKEN_NOT_EXIST);
		}
		return result;
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public @ResponseBody ReturnModel modify(String token,
			@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "birthday", required = false) String birthday,
			@RequestParam(value = "phone", required = false) String phone,
			@RequestParam(value = "sex", required = false) String sex, HttpServletResponse response,
			HttpServletRequest request) {
		ReturnModel result = new ReturnModel();


		if (StringUtil.isEmpty(token)) {
			result.setResult(false);
			result.setReason(Constant.REASON_TOKEN_IS_NULL);
			return result;
		}
		
		if(!loginTokenService.isTokenValid(token)){
			result.setResult(false);
			result.setReason(Constant.REASON_TOKEN_IS_INVALIID);
			return result;
		}

		logger.info("======进入了UserController的/modify方法，参数：username = " + username + " email = " + email + " phone = "
				+ "birthday" + birthday + phone + " sex = " + sex + " token = " + token);

		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");

		LoginToken loginToken = loginTokenService.getLoginTokenByToken(token);
		logger.info("loginToken:" + loginToken);
		if (loginToken != null & Constant.LOGIN_TOKEN_STATUS_VALID.equals(loginToken.getStatus())) {

			String userId = loginToken.getUserid();
			YaoxintongUser user = null;
			if (userId != null) {

				user = userService.getUser(userId);

				if (user != null) {

					// 修改用户信息
					if (!StringUtil.isEmpty(username)) {
						// 验证是否该用户名是否已经存在
						YaoxintongUser userExist = userService.getUser(username);
						// case already registered
						if (userExist != null) {
							result.setResult(false);
							result.setReason(Constant.REASON_USERNAME_IS_IN_USE);
							return result;
						}
						user.setUsername(username);
					}

					if (StringUtil.isEmpty(sex)) {
						user.setSex(Constant.SEX_UNKNOWN);
					} else {
						user.setSex(sex);
					}

					if (StringUtil.isEmpty(birthday)) {
					} else {
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
						try {
							user.setBirthday(sdf.parse(birthday));
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					logger.info("user:" + user);
					userService.updateUser(user);
					int i1 = 0, i2 = 0;

					ContactInformation information = null;
					List<ContactInformation> contactInfomations = null;
					// 修改邮箱信息
					if (!StringUtil.isEmpty(email)) {
						contactInfomations = contactInformationService.getContactInfomation(userId,
								Constant.CONTACT_INFO_TYPE_EMAIL);
						if (contactInfomations.size() > 0) {
							information = contactInfomations.get(0);
							information.setContactInfo(email);
							i1 = contactInformationService.updateContactInfomation(information);
						} else {
							i1 = insertContactInfo(email, userId, Constant.CONTACT_INFO_TYPE_EMAIL);
						}
					}
					// 修改手机号码
					if (!StringUtil.isEmpty(phone)) {
						contactInfomations = contactInformationService.getContactInfomation(userId,
								Constant.CONTACT_INFO_TYPE_PHONE);
						if (contactInfomations.size() > 0) {
							information = contactInfomations.get(0);
							information.setContactInfo(phone);
							i2 = contactInformationService.updateContactInfomation(information);
						} else {
							i1 = insertContactInfo(phone, userId, Constant.CONTACT_INFO_TYPE_PHONE);
						}
					}

					Map<String, Object> datum = new HashMap<String, Object>();
					datum.put("userId", userId);
					datum.put("email", (i1 > 0) ? Constant.STRING_TRUE : Constant.STRING_FALSE);
					datum.put("phone", (i2 > 0) ? Constant.STRING_TRUE : Constant.STRING_FALSE);
					result.setDatum(datum);
					result.setResult(true);

				} else {
					result.setResult(false);
					result.setReason(Constant.REASON_USER_NOT_EXIST);
					return result;
				}
			} else {
				result.setResult(false);
				result.setReason(Constant.REASON_USER_NOT_EXIST);
			}
		} else {
			result.setResult(false);
			result.setReason(Constant.REASON_LOGIN_TOKEN_NOT_EXIST);
			return result;
		}
		return result;

	}

	@RequestMapping(value = "/changepassword", method = RequestMethod.POST)
	public @ResponseBody ReturnModel changePassword(String token, String password, String new_password,
			HttpServletResponse response, HttpServletRequest request) {
		ReturnModel result = new ReturnModel();

		if (StringUtil.isEmpty(token)) {
			result.setResult(false);
			result.setReason(Constant.REASON_TOKEN_IS_NULL);
			return result;
		}

		if(!loginTokenService.isTokenValid(token)){
			result.setResult(false);
			result.setReason(Constant.REASON_TOKEN_IS_INVALIID);
			return result;
		}
		
		logger.info("======进入了UserController的/changepassword方法，参数：password = " + password + " new_password:"
				+ new_password + " token = " + token);

		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");

		LoginToken loginToken = loginTokenService.getLoginTokenByToken(token);
		logger.info("loginToken:" + loginToken);
		if (loginToken != null & Constant.LOGIN_TOKEN_STATUS_VALID.equals(loginToken.getStatus())) {

			YaoxintongUser user = userService.getUser(loginToken.getUserid());

			if (user != null) {
				String enpassword = passwordHelper.encryptPassword(password, user.getSalt());
				if (user.getPassword().equals(enpassword)) {
					PasswordAndSalt encryptPassword = passwordHelper.encryptPassword(new_password);
					user.setPassword(encryptPassword.getPassword());// 密码加密
					user.setSalt(encryptPassword.getSalt());
					logger.info("user:" + user);
					userService.updateUser(user);
					result.setResult(true);
				} else {
					result.setResult(false);
					result.setReason(Constant.REASON_OLDPASSWORLD_ERROR);
					return result;
				}
			} else {
				result.setResult(false);
				result.setReason(Constant.REASON_USER_NOT_EXIST);
				return result;
			}
		} else {
			result.setResult(false);
			result.setReason(Constant.REASON_LOGIN_TOKEN_NOT_EXIST);
			return result;
		}
		return result;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public @ResponseBody ReturnModel logout(String token, String new_password, HttpServletResponse response,
			HttpServletRequest request) {
		ReturnModel result = new ReturnModel();

		if (StringUtil.isEmpty(token)) {
			result.setResult(false);
			result.setReason(Constant.REASON_TOKEN_IS_NULL);
			return result;
		}

		if(!loginTokenService.isTokenValid(token)){
			result.setResult(false);
			result.setReason(Constant.REASON_TOKEN_IS_INVALIID);
			return result;
		}
		
		logger.info("======进入了UserController的/logout方法，参数 token = " + token);

		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");

		LoginToken loginToken = loginTokenService.getLoginTokenByToken(token);
		logger.info("loginToken:" + loginToken);
		if (loginToken != null & Constant.LOGIN_TOKEN_STATUS_VALID.equals(loginToken.getStatus())) {

			YaoxintongUser user = userService.getUser(loginToken.getUserid());

			if (user != null) {
				loginToken.setStatus("0");
				int i = loginTokenService.updateLoginToken(loginToken);
				if (i > 0) {
					result.setResult(true);
				} else {
					result.setReason("");
				}
			} else {
				result.setResult(false);
				result.setReason(Constant.REASON_USER_NOT_EXIST);
				return result;
			}
		} else {
			result.setResult(false);
			result.setReason(Constant.REASON_LOGIN_TOKEN_NOT_EXIST);
			return result;
		}
		return result;
	}
}

package cn.edu.bupt.yaoxintong.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.bupt.yaoxintong.pojo.LoginToken;
import cn.edu.bupt.yaoxintong.service.LoginTokenService;
import cn.edu.bupt.yaoxintong.service.UserOrderService;
import cn.edu.bupt.yaoxintong.util.Constant;
import cn.edu.bupt.yaoxintong.util.ReturnModel;
import cn.edu.bupt.yaoxintong.util.StringUtil;

@Controller
@RequestMapping("/userorder")
public class UserOrderController {

	@Autowired
	private UserOrderService orderService;
	
	@Autowired
	LoginTokenService loginTokenService;

	private static final Logger logger = Logger.getLogger(UserController.class);

	@RequestMapping(value = "/orders", method = RequestMethod.POST)
	private @ResponseBody ReturnModel orders(String token, HttpServletResponse response, HttpServletRequest request) {

		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");
		
		ReturnModel result = new ReturnModel();
		if(StringUtil.isEmpty(token)) {
			result.setResult(false);
			if(Constant.DEBUG) {
				result.setReason(Constant.REASON_TOKEN_IS_NULL);
			}else {
				result.setReason(Constant.REASON_UNKNOW);
			}
			
		}
		else {
			
			if(!loginTokenService.isTokenValid(token)){
				result.setResult(false);
				result.setReason(Constant.REASON_TOKEN_IS_INVALIID);
				return result;
			}
			
			LoginToken loginToken = loginTokenService.getLoginTokenByToken(token);
			
			if (loginToken != null&Constant.LOGIN_TOKEN_STATUS_VALID.equals(loginToken.getStatus())) {
				String userId = loginToken.getUserid();
				if (userId != null) {
					logger.info("======进入了UserOrderController的/orders方法，参数：userId = " + userId);
					result.setDatum(orderService.getAllUserOrder(userId));
					result.setResult(true); 
				}else {
					result.setResult(false);
					if(Constant.DEBUG) {
						result.setReason(Constant.REASON_USERID_IS_NULL);
					}else {
						result.setReason(Constant.REASON_UNKNOW);
					}
				}
			}else {
				result.setResult(false);
				result.setReason(Constant.REASON_LOGIN_TOKEN_NOT_EXIST);
			}
		}
		return result;
	}
	
	@RequestMapping(value = "/order", method = RequestMethod.POST)
	private @ResponseBody ReturnModel order(String token, String id, HttpServletResponse response, HttpServletRequest request) {
		
		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");
		
		ReturnModel result = new ReturnModel();
		
		if(StringUtil.isEmpty(token)) {
			result.setResult(false);
			if(Constant.DEBUG) {
				result.setReason(Constant.REASON_TOKEN_IS_NULL);
			}else {
				result.setReason(Constant.REASON_UNKNOW);
			}
			
		}
		else {
			
			if(!loginTokenService.isTokenValid(token)){
				result.setResult(false);
				result.setReason(Constant.REASON_TOKEN_IS_INVALIID);
				return result;
			}
			
			LoginToken loginToken = loginTokenService.getLoginTokenByToken(token);
			
			if (loginToken != null&Constant.LOGIN_TOKEN_STATUS_VALID.equals(loginToken.getStatus())) {
				if(StringUtil.isEmpty(id)) {
					result.setResult(false);
					if(Constant.DEBUG) {
						result.setReason(Constant.REASON_ID_IS_NULL);
					}else {
						result.setReason(Constant.REASON_UNKNOW);
					}				
				}else {
					logger.info("======进入了UserOrderController的/order方法，参数：id = " + id);
					result.setResult(true);
					result.setDatum(orderService.getUserOrderById(id));
				}
			}else {
				result.setResult(false);
				result.setReason(Constant.REASON_LOGIN_TOKEN_NOT_EXIST);
			}
		}
		
		return result;
	}
}

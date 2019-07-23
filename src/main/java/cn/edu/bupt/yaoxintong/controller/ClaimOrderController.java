package cn.edu.bupt.yaoxintong.controller;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.edu.bupt.yaoxintong.pojo.ClaimOrder;
import cn.edu.bupt.yaoxintong.pojo.LoginToken;
import cn.edu.bupt.yaoxintong.service.ClaimOrderService;
import cn.edu.bupt.yaoxintong.service.LoginTokenService;
import cn.edu.bupt.yaoxintong.util.Constant;
import cn.edu.bupt.yaoxintong.util.FileUtil;
import cn.edu.bupt.yaoxintong.util.ReturnModel;
import cn.edu.bupt.yaoxintong.util.StringUtil;

@Controller
@RequestMapping("/user/claim_order/")
public class ClaimOrderController {

	@Autowired
	private ClaimOrderService claimOrderService;
	@Autowired
	private LoginTokenService loginTokenService;

	private static final Logger logger = Logger.getLogger(UserController.class);

	@RequestMapping(value = "/apply", method = RequestMethod.POST)
	private @ResponseBody ReturnModel orders(String token, String orderNumber, String medicineName,
			MultipartFile invoice, String paybackway, String claimReason, HttpServletResponse response,
			HttpServletRequest request) {

		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");
		logger.info("======进入了ClaimOrderController的/apply方法，参数：token = " + token);

		ReturnModel result = new ReturnModel();
		if (StringUtil.isEmpty(token)) {
			result.setResult(false);
			if (Constant.DEBUG) {
				result.setReason(Constant.REASON_TOKEN_IS_NULL);
			} else {
				result.setReason(Constant.REASON_UNKNOW);
			}

		}

		if (StringUtil.isEmpty(orderNumber)) {
			result.setResult(false);
			if (Constant.DEBUG) {
				result.setReason(Constant.REASON_TOKEN_IS_NULL);
			} else {
				result.setReason(Constant.REASON_UNKNOW);
			}

		}
		if (StringUtil.isEmpty(medicineName)) {
			result.setResult(false);
			if (Constant.DEBUG) {
				result.setReason(Constant.REASON_TOKEN_IS_NULL);
			} else {
				result.setReason(Constant.REASON_UNKNOW);
			}

		}
		if (StringUtil.isEmpty(paybackway)) {
			result.setResult(false);
			if (Constant.DEBUG) {
				result.setReason(Constant.REASON_TOKEN_IS_NULL);
			} else {
				result.setReason(Constant.REASON_UNKNOW);
			}

		}
		if (StringUtil.isEmpty(claimReason)) {
			result.setResult(false);
			if (Constant.DEBUG) {
				result.setReason(Constant.REASON_TOKEN_IS_NULL);
			} else {
				result.setReason(Constant.REASON_UNKNOW);
			}

		}
		if (invoice != null & invoice.isEmpty()) {
			result.setResult(false);
			if (Constant.DEBUG) {
				result.setReason(Constant.REASON_TOKEN_IS_NULL);
			} else {
				result.setReason(Constant.REASON_UNKNOW);
			}

		}

		if (!loginTokenService.isTokenValid(token)) {
			result.setResult(false);
			result.setReason(Constant.REASON_TOKEN_IS_INVALIID);
			return result;
		}

		LoginToken loginToken = loginTokenService.getLoginTokenByToken(token);

		if (loginToken != null & Constant.LOGIN_TOKEN_STATUS_VALID.equals(loginToken.getStatus())) {
			String userId = loginToken.getUserid();
			if (userId != null) {
				ClaimOrder claimOrder = new ClaimOrder();
				String id = UUID.randomUUID().toString();
				claimOrder.setId(id);
				claimOrder.setOrderId(orderNumber);
				claimOrder.setClaimKind(paybackway);
				claimOrder.setClaimReason(claimReason);
				claimOrder.setMedicineName(medicineName);
				claimOrder.setClaimDate(new Date());

				try {
					String url = FileUtil.storeImgRondom(invoice, request);
					claimOrder.setInvoice(url);
				} catch (IllegalStateException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					result.setResult(false);
					result.setReason(Constant.REASON_FILE_UPLOAD_FAILED);
					return result;
				}
				result.setDatum(claimOrder);
				boolean r = claimOrderService.addClaimOrder(claimOrder);
				result.setResult(r);
				result.setDatum(id);
			} else {
				result.setResult(false);
				if (Constant.DEBUG) {
					result.setReason(Constant.REASON_USERID_IS_NULL);
				} else {
					result.setReason(Constant.REASON_UNKNOW);
				}
			}
		} else {
			result.setResult(false);
			result.setReason(Constant.REASON_LOGIN_TOKEN_NOT_EXIST);
		}
		return result;
	}

	@RequestMapping(value = "/status", method = RequestMethod.POST)
	public @ResponseBody ReturnModel applyAuthenticationstatus(String token, String id, HttpServletResponse response,
			HttpServletRequest request) throws Exception {
		ReturnModel result = new ReturnModel();

		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");

		if (StringUtil.isEmpty(token)) {
			result.setResult(false);
			result.setReason(Constant.REASON_TOKEN_IS_NULL);
			return result;
		}

		if (StringUtil.isEmpty(id)) {
			result.setResult(false);
			result.setReason(Constant.REASON_UNKNOW);
			return result;
		}

		logger.info("======进入了ClaimOrderController的/status方法，参数 token = " + token + " id =" + id);

		if (!loginTokenService.isTokenValid(token)) {
			result.setResult(false);
			result.setReason(Constant.REASON_TOKEN_IS_INVALIID);
			return result;
		}

		LoginToken loginToken = loginTokenService.getLoginTokenByToken(token);
		logger.info("loginToken:" + loginToken);
		if (loginToken != null & Constant.LOGIN_TOKEN_STATUS_VALID.equals(loginToken.getStatus())) {
			logger.info("loginToken.getUserid():" + loginToken.getUserid());
			String user_id = loginToken.getUserid();
			if (user_id != null) {
				ClaimOrder claimOrder = claimOrderService.searchOrderByOrderId(id);
				logger.info(claimOrder.toString());
				result.setDatum(claimOrder);
				result.setResult(true);
				return result;
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
	}

}

package cn.edu.bupt.yaoxintong.response.model;

import cn.edu.bupt.yaoxintong.pojo.AuthenticationDianshang;
import cn.edu.bupt.yaoxintong.pojo.AuthenticationYaoqi;

public class AuthentocationInfo {
	private BusinessInfo business;
	private AuthenticationYaoqi authenticationYaoqi;
	private AuthenticationDianshang authenticationDianshang;

	public BusinessInfo getBusiness() {
		return business;
	}

	public void setBusiness(BusinessInfo business) {
		this.business = business;
	}

	public AuthenticationYaoqi getAuthenticationYaoqi() {
		return authenticationYaoqi;
	}

	public void setAuthenticationYaoqi(AuthenticationYaoqi authenticationYaoqi) {
		this.authenticationYaoqi = authenticationYaoqi;
	}

	public AuthenticationDianshang getAuthenticationDianshang() {
		return authenticationDianshang;
	}

	public void setAuthenticationDianshang(AuthenticationDianshang authenticationDianshang) {
		this.authenticationDianshang = authenticationDianshang;
	}

}

package cn.edu.bupt.yaoxintong.service;

import cn.edu.bupt.yaoxintong.pojo.AuthenticationDianshang;
import cn.edu.bupt.yaoxintong.pojo.AuthenticationYaoqi;

public interface AuthenticationService {
    AuthenticationYaoqi getAuthenticationYaoqi();
	AuthenticationDianshang getAuthenticationDianshang();
	boolean AddAuthenticationDianshang(AuthenticationDianshang dianshang);
}
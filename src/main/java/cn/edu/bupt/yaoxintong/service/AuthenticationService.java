package cn.edu.bupt.yaoxintong.service;

import cn.edu.bupt.yaoxintong.pojo.AuthenticationDianshang;
import cn.edu.bupt.yaoxintong.pojo.AuthenticationYaoqi;

public interface AuthenticationService {
	/**
	 * 
	 * @param dianshang
	 * @return
	 */
    boolean addAuthenticationYaoqi(AuthenticationYaoqi dianshang);
   /**
    * 
    * @param dianshang
    * @return
    */
    boolean addAuthenticationDianshang(AuthenticationDianshang dianshang);
}
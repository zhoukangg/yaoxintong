package cn.edu.bupt.yaoxintong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.AuthenticationDianshangMapper;
import cn.edu.bupt.yaoxintong.dao.AuthenticationYaoqiMapper;
import cn.edu.bupt.yaoxintong.pojo.AuthenticationDianshang;
import cn.edu.bupt.yaoxintong.pojo.AuthenticationYaoqi;
import cn.edu.bupt.yaoxintong.service.AuthenticationService;


@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	AuthenticationYaoqiMapper authenticationYaoqiMapper;
	@Autowired
	AuthenticationDianshangMapper authenticationDianshangMapper;
	
	@Override
	public boolean addAuthenticationYaoqi(AuthenticationYaoqi yaoqi) {
		// TODO Auto-generated method stub
		return authenticationYaoqiMapper.insert(yaoqi)>0;
	}

	@Override
	public boolean addAuthenticationDianshang(AuthenticationDianshang dianshang) {
		// TODO Auto-generated method stub
		return authenticationDianshangMapper.insert(dianshang)>0;
	}

}

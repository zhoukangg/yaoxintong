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
    @Autowired AuthenticationDianshangMapper dianshangMapper;
    @Autowired AuthenticationYaoqiMapper yaoqiMapper;
	
	@Override
	public AuthenticationYaoqi getAuthenticationYaoqi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthenticationDianshang getAuthenticationDianshang() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean AddAuthenticationDianshang(AuthenticationDianshang dianshang) {
		// TODO Auto-generated method stub
		int i=dianshangMapper.insert(dianshang);
		return (i>0)?true:false;
	}

}

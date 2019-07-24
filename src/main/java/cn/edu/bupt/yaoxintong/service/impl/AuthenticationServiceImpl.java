package cn.edu.bupt.yaoxintong.service.impl;

import java.util.List;

import cn.edu.bupt.yaoxintong.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.AuthenticationDianshangMapper;
import cn.edu.bupt.yaoxintong.dao.AuthenticationYaoqiMapper;
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
		return authenticationYaoqiMapper.insert(yaoqi) > 0;
	}

	public AuthenticationYaoqi getAuthYaoqiByBusinessId(String businessId) {
		AuthenticationYaoqiExample example = new AuthenticationYaoqiExample();
		example.createCriteria().andBusinessIdEqualTo(businessId);
		List<AuthenticationYaoqi> list = authenticationYaoqiMapper.selectByExample(example);
		return list.size()>0?list.get(0):null;
	}

	@Override
	public boolean addAuthenticationDianshang(AuthenticationDianshang dianshang) {
		// TODO Auto-generated method stub
		return authenticationDianshangMapper.insert(dianshang) > 0;
	}

	public AuthenticationDianshang getAuthDianShangByBusinessId(String businessId) {
		AuthenticationDianshangExample example = new AuthenticationDianshangExample();
		example.createCriteria().andBusinessIdEqualTo(businessId);
		List<AuthenticationDianshang> list = authenticationDianshangMapper.selectByExample(example);
		return list.size()>0?list.get(0):null;
	}

	@Override
	public List<AuthenticationYaoqi> getAuthenticationYaoqiByBusinessId(String id) {
		AuthenticationYaoqiExample example = new AuthenticationYaoqiExample();
		example.createCriteria().andBusinessIdEqualTo(id);
		return authenticationYaoqiMapper.selectByExample(example);
	}

	@Override
	public List<AuthenticationDianshang> getAuthenticationDianshangByBusinessId(String id) {
		AuthenticationDianshangExample example = new AuthenticationDianshangExample();
		example.createCriteria().andBusinessIdEqualTo(id);
		return authenticationDianshangMapper.selectByExample(example);
	}

}

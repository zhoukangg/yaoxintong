package cn.edu.bupt.yaoxintong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.UserOrderMapper;
import cn.edu.bupt.yaoxintong.pojo.UserOrder;
import cn.edu.bupt.yaoxintong.pojo.UserOrderExample;
import cn.edu.bupt.yaoxintong.service.UserOrderService;

@Service
public class UserOrderServiceImpl implements UserOrderService {
	
	@Autowired
	UserOrderMapper userOrderMapper;

	@Override
	public List<UserOrder> getAllUserOrder(String userId) {
		// TODO Auto-generated method stub
		UserOrderExample example = new UserOrderExample();
		example.createCriteria().andUserIdEqualTo(userId);
		List<UserOrder> datum = userOrderMapper.selectByExample(example);
		return datum;
	}

	@Override
	public UserOrder getUserOrderById(String id) {
		// TODO Auto-generated method stub
		UserOrder datum = userOrderMapper.selectByPrimaryKey(id);
		return datum;
	}
}

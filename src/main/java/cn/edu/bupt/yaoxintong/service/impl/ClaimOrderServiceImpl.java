package cn.edu.bupt.yaoxintong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.ClaimOrderMapper;
import cn.edu.bupt.yaoxintong.pojo.ClaimOrder;
import cn.edu.bupt.yaoxintong.pojo.ClaimOrderExample;
import cn.edu.bupt.yaoxintong.service.ClaimOrderService;

@Service
public class ClaimOrderServiceImpl implements ClaimOrderService {

	@Autowired
	ClaimOrderMapper claimOrderMapper;

	@Override
	public boolean addClaimOrder(ClaimOrder claimOrder) {
		// TODO Auto-generated method stub
		return claimOrderMapper.insert(claimOrder) > 0;
	}

	@Override
	public ClaimOrder searchOrderById(String id) {
		// TODO Auto-generated method stub
		return claimOrderMapper.selectByPrimaryKey(id);
	}

	@Override
	public ClaimOrder searchOrderByOrderId(String id) {
		ClaimOrderExample example = new ClaimOrderExample();
		example.createCriteria().andOrderIdEqualTo(id);
		List<ClaimOrder> list = claimOrderMapper.selectByExample(example);
		return list.size()==0?null:list.get(0);
	}

}

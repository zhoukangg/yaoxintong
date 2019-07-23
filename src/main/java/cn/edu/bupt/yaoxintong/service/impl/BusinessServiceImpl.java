package cn.edu.bupt.yaoxintong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.YaoxintongBusinessMapper;
import cn.edu.bupt.yaoxintong.pojo.YaoxintongBusiness;
import cn.edu.bupt.yaoxintong.pojo.YaoxintongBusinessExample;
import cn.edu.bupt.yaoxintong.service.BusinessService;

@Service
public class BusinessServiceImpl implements BusinessService {
	@Autowired
	YaoxintongBusinessMapper businessMapper;
	@Override
	public int addUser(YaoxintongBusiness user) {
		int i = businessMapper.insert(user);
		return i;
	}

	@Override
	public int deleteUser(String id) {
		int i = businessMapper.deleteByPrimaryKey(id);
		return i;
	}

	@Override
	public int updateUser(YaoxintongBusiness user) {
		int i = businessMapper.updateByPrimaryKey(user);
		return i;
	}

	@Override
	public YaoxintongBusiness getUser(String id) {
		return businessMapper.selectByPrimaryKey(id);
	}

	@Override
	public YaoxintongBusiness getUserByUsername(String username) {
		// TODO Auto-generated method stub @author 作者wydewy
		YaoxintongBusinessExample example = new YaoxintongBusinessExample();
		example.createCriteria().andUsernameEqualTo(username);
		List<YaoxintongBusiness> list = businessMapper.selectByExample(example);
		return list.size()>0?list.get(0):null;
	}

}

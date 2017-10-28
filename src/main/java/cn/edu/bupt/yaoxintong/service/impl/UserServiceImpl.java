package cn.edu.bupt.yaoxintong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.YaoxintongUserMapper;
import cn.edu.bupt.yaoxintong.pojo.YaoxintongUser;
import cn.edu.bupt.yaoxintong.pojo.YaoxintongUserExample;
import cn.edu.bupt.yaoxintong.service.UserService;

/**
 * @author 作者wydewy
 * @version 创建时间：2017年7月21日 下午6:59:40 
 * 类说明:提供用户相关服务
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	YaoxintongUserMapper userMapper;

	@Override
	public int addUser(YaoxintongUser user) {
		int i = userMapper.insert(user);
		return i;
	}

	@Override
	public int deleteUser(String id) {
		int i = userMapper.deleteByPrimaryKey(id);
		return i;
	}

	@Override
	public int updateUser(YaoxintongUser user) {
		int i = userMapper.updateByPrimaryKey(user);
		return i;
	}

	@Override
	public YaoxintongUser getUser(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public YaoxintongUser getUserByUsername(String username) {
		// TODO Auto-generated method stub @author 作者wydewy
		YaoxintongUserExample example = new YaoxintongUserExample();
		example.createCriteria().andUsernameEqualTo(username);
		List<YaoxintongUser> list = userMapper.selectByExample(example);
		return list.size()>0?list.get(0):null;
	}
}

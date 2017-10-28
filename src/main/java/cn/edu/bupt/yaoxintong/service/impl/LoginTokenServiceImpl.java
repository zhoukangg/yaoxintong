package cn.edu.bupt.yaoxintong.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.LoginTokenMapper;
import cn.edu.bupt.yaoxintong.pojo.LoginToken;
import cn.edu.bupt.yaoxintong.pojo.LoginTokenExample;
import cn.edu.bupt.yaoxintong.service.LoginTokenService;
import cn.edu.bupt.yaoxintong.util.Constant;

/**
 * @author 作者wydewy
 * @version 创建时间：2017年7月28日 下午1:11:00
 * 
 *          类说明
 */
@Service
public class LoginTokenServiceImpl implements LoginTokenService {

	@Autowired
	LoginTokenMapper loginTokenMapper;

	@Override
	public int addLoginToken(LoginToken loginToken) {
		// TODO Auto-generated method stub @author 作者wydewy
		int i = loginTokenMapper.insert(loginToken);
		return i;
	}

	@Override
	public int deleteLoginToken(Integer id) {
		// TODO Auto-generated method stub @author 作者wydewy
		int i = loginTokenMapper.deleteByPrimaryKey(id);
		return i;
	}

	@Override
	public int updateLoginToken(LoginToken loginToken) {
		// TODO Auto-generated method stub @author 作者wydewy
		int i = loginTokenMapper.updateByPrimaryKey(loginToken);
		return i;
	}

	@Override
	public LoginToken getLoginToken(Integer id) {
		// TODO Auto-generated method stub @author 作者wydewy
		LoginToken loginToken = loginTokenMapper.selectByPrimaryKey(id);
		return loginToken;
	}

	@Override
	public LoginToken getLoginTokenByToken(String token) {
		List<LoginToken> list = null;
		LoginTokenExample example = new LoginTokenExample();
		example.createCriteria().andTokenEqualTo(token);
		list = loginTokenMapper.selectByExample(example);
		return list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public boolean isTokenValid(String token) {
		// TODO Auto-generated method stub
		LoginToken loginToken = getLoginTokenByToken(token);
		if (loginToken != null) {
			Date createTime = loginToken.getCreateTime();
			Date current = new Date();
			System.out.println("过了："+Math.abs(current.getTime() - createTime.getTime()));
			System.out.println("过了："+Math.abs(current.getTime() - createTime.getTime()) / (1000 *60));
			if (Math.abs(current.getTime() - createTime.getTime()) / (1000 * 60) >= 1) {
				loginToken.setStatus(Constant.LOGIN_TOKEN_STATUS_INVALID);
				loginTokenMapper.updateByPrimaryKey(loginToken);
				return false;
			} else {
				loginToken.setCreateTime(current);
				loginTokenMapper.updateByPrimaryKey(loginToken);
				return true;
			}
		}else {
			return false;
		}
	}

}

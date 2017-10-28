package cn.edu.bupt.yaoxintong.service;

import cn.edu.bupt.yaoxintong.pojo.LoginToken;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月28日 下午1:04:07
* 
* 类说明 
*/
public interface LoginTokenService {
	/**
	 * 添加登陆令牌
	 * @param user 要添加的登陆令牌
	 * @return
	 */
	int addLoginToken(LoginToken loginToken);
	/**
	 * 删除登陆令牌
	 * @param id 要删除的登陆令牌
	 * @return
	 */
	int deleteLoginToken(Integer id);
	/**
	 * 更新登陆令牌数据
	 * @param loginToken 带更新数据的登陆令牌,根据id进行更新，id不允许为空否则报错
	 * @return
	 */
	int updateLoginToken(LoginToken loginToken);
	/**
	 * 根据id查询登陆令牌信息
	 * @param id 获得登陆令牌信息
	 * @return
	 */
	LoginToken getLoginToken(Integer id);
	/**
	 * 查询令牌
	 * @param token 
	 * @return
	 */
	LoginToken getLoginTokenByToken(String token);
	
	/**
	 * 查询令牌
	 * @param token 
	 * @return
	 */
	boolean isTokenValid(String token);
}

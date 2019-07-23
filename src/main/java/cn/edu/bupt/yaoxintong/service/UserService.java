package cn.edu.bupt.yaoxintong.service;

import cn.edu.bupt.yaoxintong.pojo.YaoxintongUser;

/**
 * @author 作者wydewy
 * @version 创建时间：2017年7月21日 下午6:58:42 
 * 接口说明:提供用户相关服务
 */
public interface UserService {
	
	/**
	 * 添加用户
	 * @param user 要添加的用户
	 * @return
	 */
	int addUser(YaoxintongUser user);
	/**
	 * 删除用户
	 * @param id 要删除的用户
	 * @return
	 */
	int deleteUser(String id);
	/**
	 * 更新用户数据
	 * @param user 带更新数据的用户,根据id进行更新，id不允许为空否则报错
	 * @return
	 */
	int updateUser(YaoxintongUser user);
	/**
	 * 根据id查询用户信息
	 * @param id 获得用户信息
	 * @return
	 */
	YaoxintongUser getUser(String id);
	/**
	 * 根据用户名查询用户
	 * @param username 
	 * @return
	 */
	YaoxintongUser getUserByUsername(String username);
}

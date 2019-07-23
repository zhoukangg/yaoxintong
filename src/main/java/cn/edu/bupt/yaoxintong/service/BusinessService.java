package cn.edu.bupt.yaoxintong.service;


import cn.edu.bupt.yaoxintong.pojo.YaoxintongBusiness;

public interface BusinessService {
	/**
	 * 添加企业
	 * @param user 要添加的企业
	 * @return
	 */
	int addUser(YaoxintongBusiness user);
	/**
	 * 删除企业
	 * @param id 要删除的企业
	 * @return
	 */
	int deleteUser(String id);
	/**
	 * 更新企业数据
	 * @param user 带更新数据的企业,根据id进行更新，id不允许为空否则报错
	 * @return
	 */
	int updateUser(YaoxintongBusiness user);
	/**
	 * 根据id查询企业信息
	 * @param id 获得企业信息
	 * @return
	 */
	YaoxintongBusiness getUser(String id);
	/**
	 * 根据企业名查询企业
	 * @param username 
	 * @return
	 */
	YaoxintongBusiness getUserByUsername(String username);
}

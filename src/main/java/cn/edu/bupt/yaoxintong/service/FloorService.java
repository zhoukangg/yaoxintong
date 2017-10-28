package cn.edu.bupt.yaoxintong.service;

import java.util.List;

import cn.edu.bupt.yaoxintong.pojo.custom.Floor;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月28日 下午4:14:16
* 
* 类说明 
*/
public interface FloorService {
	/**
	 * 添加用户
	 * @param floor 要添加的用户
	 * @return
	 */
	int addFloor(Floor floor);
	/**
	 * 删除用户
	 * @param id 要删除的用户
	 * @return
	 */
	int deleteFloor(Integer id);
	/**
	 * 更新用户数据
	 * @param floor 带更新数据的用户,根据id进行更新，id不允许为空否则报错
	 * @return
	 */
	int updateFloor(Floor floor);
	/**
	 * 根据floor查询用户信息
	 * @param floor 获得用户信息
	 * @return
	 */
	List<Floor> getFloor(Integer floor);
	/**
	 * 获取楼层的一级类别
	 * @return
	 */
	List<Floor> getFloorMedicineClass(int start,int end);
	/**
	 * 根据楼层名获取楼层的一级类别
	 * @return
	 */
	List<Floor> getFloorMedicineClassByName(Integer floor);
	
	
}

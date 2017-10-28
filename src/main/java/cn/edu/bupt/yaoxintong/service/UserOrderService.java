package cn.edu.bupt.yaoxintong.service;

import java.util.List;

import cn.edu.bupt.yaoxintong.pojo.UserOrder;

public interface UserOrderService {

	/**
	 * 根据用户id查看所有订单
	 * @return
	 */
	List<UserOrder> getAllUserOrder(String token );
	/**
	 * 根据订单id查看订单
	 * @return
	 */
	UserOrder getUserOrderById(String id);
}

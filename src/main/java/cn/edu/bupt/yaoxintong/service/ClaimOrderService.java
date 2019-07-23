package cn.edu.bupt.yaoxintong.service;

import cn.edu.bupt.yaoxintong.pojo.ClaimOrder;

public interface ClaimOrderService {

	boolean addClaimOrder(ClaimOrder claimOrder);

	ClaimOrder searchOrderById(String id);

	ClaimOrder searchOrderByOrderId(String id);

}

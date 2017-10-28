package cn.edu.bupt.yaoxintong.service;

import java.util.List;

import cn.edu.bupt.yaoxintong.pojo.ClaimOrder;

public interface ClaimOrderService {
	ClaimOrder getClaimorder(String id);
	List<ClaimOrder> getall();
	int increaseClaimorder(String order_id, String price,String store, String kind,String reason, String status);
	int deleteComInfo(String id);
}

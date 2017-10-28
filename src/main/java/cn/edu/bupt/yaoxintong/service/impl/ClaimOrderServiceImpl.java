package cn.edu.bupt.yaoxintong.service.impl;

import java.util.List;
import java.util.Date; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.ClaimOrderMapper;
import cn.edu.bupt.yaoxintong.pojo.ClaimOrder;
import cn.edu.bupt.yaoxintong.pojo.ClaimOrderExample;
import cn.edu.bupt.yaoxintong.service.ClaimOrderService;

@Service
public class ClaimOrderServiceImpl implements ClaimOrderService{
	@Autowired ClaimOrderMapper claimordermapper;
	@Override
	public List<ClaimOrder> getall() {
		
		ClaimOrderExample example = new ClaimOrderExample();
		return claimordermapper.selectByExample(example);
		

	}

	@Override
	public ClaimOrder getClaimorder(String id) {
		ClaimOrder claimorder =  claimordermapper.selectByPrimaryKey(id);
		return claimorder;
	}

	

	@Override
	public int deleteComInfo(String id) {
		return claimordermapper.deleteByPrimaryKey(id);
	}

	@Override
	public int increaseClaimorder(String order_id, String price, String store, String kind, String reason,
			String status) {
		ClaimOrder claimorder = new ClaimOrder();
		claimorder.setClaimId(order_id);
		claimorder.setClaimPrice(Double.parseDouble(price));
		claimorder.setMedicineStore(store);
		claimorder.setClaimKind(kind);
		claimorder.setClaimReason(reason);
		claimorder.setClaimDate(new Date());
		claimorder.setBill("还没想好");
		int i = claimordermapper.insert(claimorder);
		return i;
	}

	
}

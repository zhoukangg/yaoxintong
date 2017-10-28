package cn.edu.bupt.yaoxintong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.custom.FloorMedicineMapper;
import cn.edu.bupt.yaoxintong.pojo.custom.FloorMedicine;
import cn.edu.bupt.yaoxintong.pojo.custom.FloorMedicineExample;
import cn.edu.bupt.yaoxintong.service.FloorMedicineService;

/** 
* @author 作者wydewy
* @version 创建时间：2017年8月1日 上午10:39:40
* 
* 类说明 
*/
@Service
public class FloorMedicineServiceImpl implements FloorMedicineService {

	@Autowired FloorMedicineMapper floorMedicineMapper;
	
	@Override
	public List<FloorMedicine> getMedicinesbyFloor(Integer floor) {
		// TODO Auto-generated method stub @author 作者wydewy
		FloorMedicineExample example = new FloorMedicineExample();
		example.createCriteria().andFloorEqualTo(floor);
		return floorMedicineMapper.selectByExample(example);
	}

}

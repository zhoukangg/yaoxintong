package cn.edu.bupt.yaoxintong.service;

import java.util.List;

import cn.edu.bupt.yaoxintong.pojo.custom.FloorMedicine;

/** 
* @author 作者wydewy
* @version 创建时间：2017年8月1日 上午10:33:09
* 
* 类说明 
*/
public interface FloorMedicineService {

	List<FloorMedicine> getMedicinesbyFloor(Integer floor);
	
}

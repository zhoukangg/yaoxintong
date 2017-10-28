package cn.edu.bupt.yaoxintong.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.bupt.yaoxintong.pojo.Medicine;
import cn.edu.bupt.yaoxintong.pojo.MedicineClass;
import cn.edu.bupt.yaoxintong.pojo.custom.Floor;
import cn.edu.bupt.yaoxintong.pojo.custom.FloorMedicine;
import cn.edu.bupt.yaoxintong.response.model.BriefMedicineInfo;
import cn.edu.bupt.yaoxintong.response.model.FloorMedicineClass;
import cn.edu.bupt.yaoxintong.service.FloorMedicineService;
import cn.edu.bupt.yaoxintong.service.FloorService;
import cn.edu.bupt.yaoxintong.service.MedicineClassService;
import cn.edu.bupt.yaoxintong.service.MedicineService;
import cn.edu.bupt.yaoxintong.util.ReturnModel;

/** 
* @author 作者wydewy
* @version 创建时间：2017年8月1日 上午10:31:58
* 
* 类说明 
*/
@Controller
@RequestMapping("/mainframe")
public class FloorMedicineController {
	
	@Autowired FloorMedicineService floorMedicineService;
	@Autowired MedicineClassService medicineClassService;
	@Autowired MedicineService medicinService;
	@Autowired FloorService floorService;
	
	/**
	 * 获取楼层
	 * @return
	 */
	@RequestMapping(value = "/get_floor_medicine_class", method = RequestMethod.POST)
	public @ResponseBody ReturnModel getMedicineClassByFoor(int start,int end,HttpServletRequest request,HttpServletResponse response) {
		//解决Ajax跨域请求问题
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
		
		ReturnModel result = new ReturnModel();
		
		List<FloorMedicineClass> floorMedicineClasses = new ArrayList<>();
		
		List<Floor> allFloors = floorService.getFloorMedicineClass(start,end);
		
		//循环所有楼层名
		for(Floor f:allFloors){
			String name = f.getName();
			FloorMedicineClass floorMedicineClass = new FloorMedicineClass();
			floorMedicineClass.setName(name);
			List<Floor> floors = floorService.getFloor(f.getFloor());
			List<FloorMedicine> floorMedicines = floorMedicineService.getMedicinesbyFloor(f.getFloor());
			List<BriefMedicineInfo> briefMedicineInfo = new ArrayList<>();
			for(FloorMedicine floorMedicine:floorMedicines){
				List<Medicine> list = medicinService.searchID(floorMedicine.getMedicineId());
				if(list.size()>0){
					Medicine medicine = list .get(0);
					BriefMedicineInfo medicineInfo = new BriefMedicineInfo();
					medicineInfo.setName(medicine.getDrugName());
					medicineInfo.setPrice(medicine.getPrice().toString());
					medicineInfo.setPath(floorMedicine.getPath());
					medicineInfo.setMedicineId(floorMedicine.getMedicineId());
					briefMedicineInfo.add(medicineInfo);
				}
			}
			
			
			List<MedicineClass> medicineClasses = new ArrayList<>();
			//循环每一层楼的药品分类列表
			for(Floor ff:floors){
				Integer id = ff.getMedicineClassId();
				MedicineClass medicineClass = medicineClassService.getMedicineClass(id);
				medicineClasses.add(medicineClass);
			}
			floorMedicineClass.setMedicineClasses(medicineClasses);
			floorMedicineClass.setBriefMedicineInfo(briefMedicineInfo);
			floorMedicineClasses.add(floorMedicineClass);
			
		}
		result.setResult(true);
		result.setDatum(floorMedicineClasses);
		return result;	
	}
	
}

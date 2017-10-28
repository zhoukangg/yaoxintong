package cn.edu.bupt.yaoxintong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.bupt.yaoxintong.pojo.Medicine;
import cn.edu.bupt.yaoxintong.pojo.MedicineSimple;
import cn.edu.bupt.yaoxintong.service.MedicineService;

@Controller
public class MedicineController{

	
	@Autowired MedicineService medicineService;
	//模糊查询概览
	@RequestMapping("/search/fuzzy/{content}")
	@ResponseBody
	public List<MedicineSimple> search_fuzzy(@PathVariable String content){
		return medicineService.searchFuzzy(content);
	}
	//查询指定ID对应药品详情
	@RequestMapping("/search/{id}")
	@ResponseBody
	public List<Medicine> search_id(@PathVariable String id)
	{
		return medicineService.searchID(id);
	}
	//查询所有药品概览
	@RequestMapping("/search/All")
	@ResponseBody
	public List<MedicineSimple> search_All()
	{
		return medicineService.searchAll();
	}
	//推荐药品查询
	@RequestMapping("/search/recommend/{value}")
	@ResponseBody
	public List<MedicineSimple> search_recommend(@PathVariable Byte value)
	{
		return medicineService.searchRecommend(value);
	}
	//多条件查询概览
	@RequestMapping("/search/many/"
			+ "{condition_1}/{condition_2}/{condition_3}/{condition_4}/{condition_5}")
	@ResponseBody
	public List<MedicineSimple> search_many(@PathVariable String condition_1,
			@PathVariable String condition_2,@PathVariable String condition_3,
			@PathVariable String condition_4,@PathVariable String condition_5)
	{
		return medicineService.searchMany(condition_1,condition_2,condition_3,condition_4,condition_5);
	}
	


	
}

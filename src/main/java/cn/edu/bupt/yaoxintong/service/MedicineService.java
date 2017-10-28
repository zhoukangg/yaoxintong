package cn.edu.bupt.yaoxintong.service;

import java.util.List;
import cn.edu.bupt.yaoxintong.pojo.Medicine;
import cn.edu.bupt.yaoxintong.pojo.MedicineSimple;


public interface MedicineService {
	void insertMedicine(String id,String drugName,
			String brand,String manufacturer,String licenseNumber,
			Byte recommend,String drugForm,String type,String drugType1,
			String drugType2,String drugType3,String prescriptionType,
			String importType,String drugSpecifications,String productPlace,
			String validPeriod,String useForIllness,String useForPeople,
			String useFunction,String dosageUse,String storageCondition,
			String productWeight,double price);//插入药品；
	
	void dropMedicine(String id);//删除ID对应药品
	
	void updateMedicine(String id,String drugName,
			String brand,String manufacturer,String licenseNumber,
			Byte recommend,String drugForm,String type,String drugType1,
			String drugType2,String drugType3,String prescriptionType,
			String importType,String drugSpecifications,String productPlace,
			String validPeriod,String useForIllness,String useForPeople,
			String useFunction,String dosageUse,String storageCondition,
			String productWeight,double price);//修改ID对应药品信息
	
	List<MedicineSimple> searchRecommend(Byte value);//查询推荐药品
	List<MedicineSimple> searchAll();//查询所有药品
	List<Medicine> searchID(String id);//查询ID号，查看详情
	
	List<MedicineSimple> searchFuzzy(String content);//模糊查询概览
	List<MedicineSimple> searchMany(String condition_1,String condition_2,
			String condition_3,String condition_4,String condition_5);//多个条件的模糊查询
	List<Medicine> searchGenericName(String content);//模糊查询药品名称
	List<Medicine> searchLicenseNumber(String content);//模糊查询证件号
	List<Medicine> searchBrand(String content);//模糊查询商标
	List<Medicine> searchManufacturingEnterprise(String content);//模糊查询公司名字
	List<Medicine> searchMajorFunctions(String content);//模糊查询主治症状
}

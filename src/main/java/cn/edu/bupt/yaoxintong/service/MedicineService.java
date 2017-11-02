package cn.edu.bupt.yaoxintong.service;

import java.util.List;
import cn.edu.bupt.yaoxintong.pojo.Medicine;
import cn.edu.bupt.yaoxintong.pojo.MedicineCompany;

public interface MedicineService {
	void insertMedicine(String id, String drugName, String brand, String manufacturer, String licenseNumber,
			Byte recommend, String drugForm, String type, String drugType1, String drugType2, String drugType3,
			String prescriptionType, String importType, String drugSpecifications, String productPlace,
			String validPeriod, String useForIllness, String useForPeople, String useFunction, String dosageUse,
			String storageCondition, String productWeight, double price);// 插入药品；

	void dropMedicine(String id);// 删除ID对应药品

	void updateMedicine(String id, String drugName, String brand, String manufacturer, String licenseNumber,
			Byte recommend, String drugForm, String type, String drugType1, String drugType2, String drugType3,
			String prescriptionType, String importType, String drugSpecifications, String productPlace,
			String validPeriod, String useForIllness, String useForPeople, String useFunction, String dosageUse,
			String storageCondition, String productWeight, double price);// 修改ID对应药品信息

	List<Medicine> searchGenericName(String content);// 模糊查询药品名称

	List<Medicine> searchLicenseNumber(String content);// 模糊查询证件号

	List<Medicine> searchBrand(String content);// 模糊查询商标

	List<Medicine> searchManufacturingEnterprise(String content);// 模糊查询公司名字

	List<Medicine> searchMajorFunctions(String content);// 模糊查询主治症状

	Medicine searchById(String id);

	List<Medicine> searchByDrugType3(String value);

	List<Medicine> getMapDatas(MedicineCompany company, String relation);

	List<Medicine> getHotMedicines();
}

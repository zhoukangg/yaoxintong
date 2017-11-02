package cn.edu.bupt.yaoxintong.service;

import java.util.List;

import cn.edu.bupt.yaoxintong.pojo.Medicine;
import cn.edu.bupt.yaoxintong.pojo.MedicineCompany;

public interface CompanyService {

	List<MedicineCompany> searchCompanyName(String word);

	List<MedicineCompany> searchCompanyProvince(String word);

	List<MedicineCompany> searchCompanyRange(String word);

	MedicineCompany searchById(String id);

	MedicineCompany getCompanyByName(String name);

	List<MedicineCompany> getCompanysByName(String name);

	List<MedicineCompany> getMapDatas(Medicine medicine, String relation);

	List<MedicineCompany> searchByProductionAddress(String productionAddress,String province);

	List<MedicineCompany> getHotCompanys();

}

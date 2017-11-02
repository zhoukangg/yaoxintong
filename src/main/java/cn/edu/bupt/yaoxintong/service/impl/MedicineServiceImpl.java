package cn.edu.bupt.yaoxintong.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.MRCMapper;
import cn.edu.bupt.yaoxintong.dao.MedicineMapper;
import cn.edu.bupt.yaoxintong.pojo.MRC;
import cn.edu.bupt.yaoxintong.pojo.MRCExample;
import cn.edu.bupt.yaoxintong.pojo.Medicine;
import cn.edu.bupt.yaoxintong.pojo.MedicineCompany;
import cn.edu.bupt.yaoxintong.pojo.MedicineExample;
import cn.edu.bupt.yaoxintong.pojo.MedicineExample.Criteria;
import cn.edu.bupt.yaoxintong.service.MedicineService;

@Service
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	MedicineMapper medicineMapper;
	@Autowired
	private MRCMapper mrcMapper;

	@Override
	public void insertMedicine(String id, String drugName, String brand, String manufacturer, String licenseNumber,
			Byte recommend, String drugForm, String type, String drugType1, String drugType2, String drugType3,
			String prescriptionType, String importType, String drugSpecifications, String productPlace,
			String validPeriod, String useForIllness, String useForPeople, String useFunction, String dosageUse,
			String storageCondition, String productWeight, double price) {
		Medicine record = new Medicine();
		record.setId(id);
		record.setDrugName(drugName);
		record.setBrand(brand);
		record.setManufacturer(manufacturer);
		record.setLicenseNumber(licenseNumber);
		record.setRecommend(recommend);
		record.setDrugForm(drugForm);
		record.setType(importType);
		record.setDrugType1(drugType1);
		record.setDrugType2(drugType2);
		record.setDrugType3(drugType3);
		record.setPrescriptionType(prescriptionType);
		record.setImportType(importType);
		record.setDrugSpecifications(drugSpecifications);
		record.setProductPlace(productPlace);
		record.setValidPeriod(validPeriod);
		record.setUseForIllness(useForIllness);
		record.setUseForPeople(useForPeople);
		record.setUseFunction(useFunction);
		record.setDosageUse(dosageUse);
		record.setStorageCondition(storageCondition);
		record.setProductWeight(productWeight);
		medicineMapper.insertSelective(record);
	}

	@Override
	public void dropMedicine(String id)// 删除ID对应药品
	{
		medicineMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateMedicine(String id, String drugName, String brand, String manufacturer, String licenseNumber,
			Byte recommend, String drugForm, String type, String drugType1, String drugType2, String drugType3,
			String prescriptionType, String importType, String drugSpecifications, String productPlace,
			String validPeriod, String useForIllness, String useForPeople, String useFunction, String dosageUse,
			String storageCondition, String productWeight, double price)// 修改ID对应药品信息
	{
		Medicine record = new Medicine();
		record.setId(id);
		record.setDrugName(drugName);
		record.setBrand(brand);
		record.setManufacturer(manufacturer);
		record.setLicenseNumber(licenseNumber);
		record.setRecommend(recommend);
		record.setDrugForm(drugForm);
		record.setType(importType);
		record.setDrugType1(drugType1);
		record.setDrugType2(drugType2);
		record.setDrugType3(drugType3);
		record.setPrescriptionType(prescriptionType);
		record.setImportType(importType);
		record.setDrugSpecifications(drugSpecifications);
		record.setProductPlace(productPlace);
		record.setValidPeriod(validPeriod);
		record.setUseForIllness(useForIllness);
		record.setUseForPeople(useForPeople);
		record.setUseFunction(useFunction);
		record.setDosageUse(dosageUse);
		record.setStorageCondition(storageCondition);
		record.setProductWeight(productWeight);
		medicineMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<Medicine> searchGenericName(String content)// 模糊查询药品名称
	{
		content = "%" + content + "%";
		MedicineExample example = new MedicineExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andDrugNameLike(content);
		List<Medicine> list = medicineMapper.selectByExample(example);
		System.out.println(list.toString());
		return list;
	}

	@Override
	public List<Medicine> searchLicenseNumber(String content)// 模糊查询证件号
	{
		content = "%" + content + "%";
		MedicineExample example = new MedicineExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andLicenseNumberLike(content);
		List<Medicine> list = medicineMapper.selectByExample(example);
		System.out.println(list.toString());
		return list;
	}

	@Override
	public List<Medicine> searchBrand(String content)// 模糊查询商标
	{
		content = "%" + content + "%";
		MedicineExample example = new MedicineExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andBrandLike(content);
		List<Medicine> list = medicineMapper.selectByExample(example);
		System.out.println(list.toString());
		return list;
	}

	@Override
	public List<Medicine> searchManufacturingEnterprise(String content)// 模糊查询公司名字
	{
		MedicineExample example = new MedicineExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andManufacturerLike(content);
		List<Medicine> list = medicineMapper.selectByExample(example);
		System.out.println(list.toString());
		return list;
	}

	@Override
	public List<Medicine> searchMajorFunctions(String content)// 模糊查询主治症状
	{
		MedicineExample example = new MedicineExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUseForIllnessLike(content);
		List<Medicine> list = medicineMapper.selectByExample(example);
		System.out.println(list.toString());
		return list;
	}

	@Override
	public Medicine searchById(String id) {
		// TODO Auto-generated method stub
		return medicineMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Medicine> searchByDrugType3(String value) {
		// TODO Auto-generated method stub
		MedicineExample example = new MedicineExample();
		example.createCriteria().andDrugType3EqualTo(value);
		List<Medicine> list = medicineMapper.selectByExample(example);
		System.out.println(list.toString());
		return list;
	}

	@Override
	public List<Medicine> getMapDatas(MedicineCompany company, String relation) {
		// TODO Auto-generated method stub
		MRCExample example = new MRCExample();
		example.createCriteria().andCIdEqualTo(company.getId()).andRelationEqualTo(relation);
		List<MRC> mrcs = mrcMapper.selectByExample(example);
		List<Medicine> list = new ArrayList<Medicine>();
		for (MRC mrc : mrcs) {
			Medicine searchById = searchById(mrc.getmId());
			list.add(searchById);
		}
		return list;
	}

	@Override
	public List<Medicine> getHotMedicines() {
		// TODO Auto-generated method stub
		MedicineExample example = new MedicineExample();
		example.createCriteria().andHotGreaterThan(0);
		return medicineMapper.selectByExample(example);
	}

}

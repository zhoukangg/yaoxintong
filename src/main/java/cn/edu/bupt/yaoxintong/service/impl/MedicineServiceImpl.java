package cn.edu.bupt.yaoxintong.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.MedicineMapper;
import cn.edu.bupt.yaoxintong.pojo.Medicine;
import cn.edu.bupt.yaoxintong.pojo.MedicineExample;
import cn.edu.bupt.yaoxintong.pojo.MedicineExample.Criteria;
import cn.edu.bupt.yaoxintong.pojo.MedicineSimple;
import cn.edu.bupt.yaoxintong.service.MedicineService;


@Service
public class MedicineServiceImpl implements MedicineService{

	@Autowired MedicineMapper medicineMapper;
	
	@Override
	public void insertMedicine(String id,String drugName,
			String brand,String manufacturer,String licenseNumber,
			Byte recommend,String drugForm,String type,String drugType1,
			String drugType2,String drugType3,String prescriptionType,
			String importType,String drugSpecifications,String productPlace,
			String validPeriod,String useForIllness,String useForPeople,
			String useFunction,String dosageUse,String storageCondition,
			String productWeight,double price)
	{
		Medicine record=new Medicine();
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
	public void dropMedicine(String id)//删除ID对应药品
	{
		medicineMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public void updateMedicine(String id,String drugName,
			String brand,String manufacturer,String licenseNumber,
			Byte recommend,String drugForm,String type,String drugType1,
			String drugType2,String drugType3,String prescriptionType,
			String importType,String drugSpecifications,String productPlace,
			String validPeriod,String useForIllness,String useForPeople,
			String useFunction,String dosageUse,String storageCondition,
			String productWeight,double price)//修改ID对应药品信息
	{
		Medicine record=new Medicine();
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
	public List<Medicine> searchID(String id)//查询ID号
	{
		MedicineExample example = new MedicineExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andIdEqualTo(id);
		List<Medicine> list = medicineMapper.selectByExample(example);
		System.out.println(list.toString());
		return list;
	}
	
	@Override
	public List<MedicineSimple> searchRecommend(Byte value)//查询推荐药品
	{
		MedicineExample example=new MedicineExample();
		Criteria createCriteria=example.createCriteria();
		createCriteria.andRecommendEqualTo(value);
		List<Medicine> list = medicineMapper.selectByExample(example);
		List<MedicineSimple> list_simple = new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			MedicineSimple medicineSimple=new MedicineSimple();
			medicineSimple.setId(list.get(i).getId());
			medicineSimple.setDrugName(list.get(i).getDrugName());
			medicineSimple.setPrice(list.get(i).getPrice());
			list_simple.add(medicineSimple);
		}
		return list_simple; 
	}
	
	@Override 
	public List<MedicineSimple> searchAll()//查询所有药品
	{
		MedicineExample example = new MedicineExample();
		//Criteria createCriteria = example.createCriteria();
		List<Medicine> list = medicineMapper.selectByExample(example);
		System.out.println(list.toString());
		List<MedicineSimple> list_simple = new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			MedicineSimple medicineSimple=new MedicineSimple();
			medicineSimple.setId(list.get(i).getId());
			medicineSimple.setDrugName(list.get(i).getDrugName());
			medicineSimple.setPrice(list.get(i).getPrice());
			list_simple.add(medicineSimple);
		}
		return list_simple;
	}
	
	@Override
	public List<MedicineSimple> searchFuzzy(String content)//模糊查询概览
	{
		List<Medicine> list=new ArrayList<>();
		List<Medicine> list_1=searchGenericName(content);
		list.addAll(list_1);
		List<Medicine> list_2=searchLicenseNumber(content);
		list.addAll(list_2);
		List<Medicine> list_3=searchBrand(content);
		list.addAll(list_3);
		List<Medicine> list_4=searchManufacturingEnterprise(content);
		list.addAll(list_4);
		List<Medicine> list_5=searchMajorFunctions(content);
		list.addAll(list_5);
		
		for  ( int  i  =   0 ; i  <  list.size()  -   1 ; i ++ ) 
		{       
		      for  ( int  j  =  list.size()  -   1 ; j  >  i; j -- )
		      {       
		           if  (list.get(i).getId().equals(list.get(j).getId()))  
		           {       
		              list.remove(j);       
		            }        
		       }        
		}
		List<MedicineSimple> list_simple = new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			MedicineSimple medicineSimple=new MedicineSimple();
			medicineSimple.setId(list.get(i).getId());
			medicineSimple.setDrugName(list.get(i).getDrugName());
			medicineSimple.setPrice(list.get(i).getPrice());
			list_simple.add(medicineSimple);
		}
		return list_simple;
	}
	
	@Override 
	public List<MedicineSimple> searchMany(String condition_1,String condition_2,
			String condition_3,String condition_4,String condition_5)//多个条件的模糊查询
	{
		condition_1="%"+condition_1+"%";
		condition_2="%"+condition_2+"%";
		condition_3="%"+condition_3+"%";
		condition_4="%"+condition_4+"%";
		condition_5="%"+condition_5+"%";
		MedicineExample example = new MedicineExample();
		Criteria createCriteria = example.createCriteria();
		
		createCriteria.andUseForIllnessLike(condition_1);
		//createCriteria.and
		createCriteria.andPrescriptionTypeLike(condition_3);
		createCriteria.andDrugFormLike(condition_4);
		//createCriteria.adn
		
		List<Medicine> list = medicineMapper.selectByExample(example);
		List<MedicineSimple> list_simple = new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			MedicineSimple medicineSimple=new MedicineSimple();
			medicineSimple.setId(list.get(i).getId());
			medicineSimple.setDrugName(list.get(i).getDrugName());
			medicineSimple.setPrice(list.get(i).getPrice());
			list_simple.add(medicineSimple);
		}
		return list_simple;
	}
	
	@Override
	public 	List<Medicine> searchGenericName(String content)//模糊查询药品名称
	{
		content = "%"+content+"%";	
		MedicineExample example = new MedicineExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andDrugNameLike(content);
		List<Medicine> list = medicineMapper.selectByExample(example);
		System.out.println(list.toString());
		return list;
	}
	@Override
	public List<Medicine> searchLicenseNumber(String content)//模糊查询证件号
	{
		content = "%"+content+"%";	
		MedicineExample example = new MedicineExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andLicenseNumberLike(content);
		List<Medicine> list = medicineMapper.selectByExample(example);
		System.out.println(list.toString());
		return list;
	}
	@Override
	public List<Medicine> searchBrand(String content)//模糊查询商标
	{
		content = "%"+content+"%";
		MedicineExample example = new MedicineExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andBrandLike(content);
		List<Medicine> list = medicineMapper.selectByExample(example);
		System.out.println(list.toString());
		return list;
	}
	@Override
	public List<Medicine> searchManufacturingEnterprise(String content)//模糊查询公司名字
	{
		MedicineExample example = new MedicineExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andManufacturerLike(content);
		List<Medicine> list = medicineMapper.selectByExample(example);
		System.out.println(list.toString());
		return list;
	}
	@Override
	public List<Medicine> searchMajorFunctions(String content)//模糊查询主治症状
	{
		MedicineExample example = new MedicineExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUseForIllnessLike(content);
		List<Medicine> list = medicineMapper.selectByExample(example);
		System.out.println(list.toString());
		return list;
	}
}

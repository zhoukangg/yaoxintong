package cn.edu.bupt.yaoxintong.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ansj.domain.Term;
import org.ansj.library.SynonymsLibrary;
import org.ansj.splitWord.analysis.BaseAnalysis;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.nlpcn.commons.lang.tire.domain.SmartForest;
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
import cn.edu.bupt.yaoxintong.util.ListUtil;
import cn.edu.bupt.yaoxintong.util.Logger;

@Service
public class MedicineServiceImpl implements MedicineService {
	private static final Logger logger = Logger.getInstance();
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
		// logger.info(list.toString());
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
		// logger.info(list.toString());
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
		// logger.info(list.toString());
		return list;
	}

	@Override
	public List<Medicine> searchManufacturingEnterprise(String content)// 模糊查询公司名字
	{
		MedicineExample example = new MedicineExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andManufacturerLike(content);
		List<Medicine> list = medicineMapper.selectByExample(example);
		// logger.info(list.toString());
		return list;
	}

	@Override
	public List<Medicine> searchMajorFunctions(String content)// 模糊查询主治症状
	{
		MedicineExample example = new MedicineExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUseForIllnessLike(content);
		List<Medicine> list = medicineMapper.selectByExample(example);
		// logger.info(list.toString());
		return list;
	}

	@Override
	public Medicine searchById(String id) {
		// TODO Auto-generated method stub
		return medicineMapper.selectByPrimaryKey(id);
//		return medicineMapper.findById(id);
	}


	@Override
	public List<Medicine> searchByDrugType3(String value) {
		// TODO Auto-generated method stub
		MedicineExample example = new MedicineExample();
		example.createCriteria().andDrugType3EqualTo(value);
		List<Medicine> list = medicineMapper.selectByExample(example);
		// logger.info(list.toString());
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

	// @Override
	public List<Medicine> searchTest(String content, int type) {
		// TODO Auto-generated method stub
		List<Medicine> all = new ArrayList<>();
		SmartForest<List<String>> branchs = SynonymsLibrary.get().getBranch(content);
		List<String> params = branchs == null ? null : branchs.getParam();
		if (params != null) {
			for (String param : params) {
				ListUtil.add2List(all, searchAll("%" + param + "%"));
			}
		} else {
			ListUtil.add2List(all, searchAll("%" + content + "%"));
		}

		if (!all.isEmpty()) {
			return all;
		}

		List<Term> termsTo = ToAnalysis.parse(content).getTerms();
		searchByTerm(type, all, termsTo);
		if (all.isEmpty()) {
			List<Term> termsBase = BaseAnalysis.parse(content).getTerms();
			searchByTerm(type, all, termsBase);
		}

		return all;
	}

	private void searchByTerm(int type, List<Medicine> all, List<Term> terms) {
		// 按照频率进行排序
//		Collections.sort(terms);

		Map<String, List<Medicine>> natureMap = new HashMap<String, List<Medicine>>();
		Map<String, String> valueMap = new HashMap<String, String>();
		for (Term term : terms) {
			System.out.println(term.getName());
			System.out.println(term.getNatureStr());
			String content = term.getName();
			SmartForest<List<String>> branchs = SynonymsLibrary.get().getBranch(content);
			List<String> params = branchs == null ? null : branchs.getParam();
			List<Medicine> list = new ArrayList<>();
			if (params != null) {
				for (String param : params) {
					switch (type) {
					case 0:
						ListUtil.add2List(list, searchGenericName("%" + param + "%"));
						break;
					case 1:
						ListUtil.add2List(list, searchMajorFunctions("%" + param + "%"));
						break;
					case 2:
						ListUtil.add2List(list, searchBrand("%" + param + "%"));
						break;
					case 3:
						ListUtil.add2List(list, searchManufacturingEnterprise("%" + param + "%"));
						break;
					case 4:
						ListUtil.add2List(list, searchAll("%" + param + "%"));
						break;
					default:
						break;
					}
					natureMap.put(term.getNatureStr(), list);
					valueMap.put(term.getNatureStr(), param);
				}
			} else {
				String param = term.getName();
				switch (type) {
				case 0:
					list = searchGenericName("%" + param + "%");
					break;
				case 1:
					list = searchMajorFunctions("%" + param + "%");
					break;
				case 2:
					list = searchBrand("%" + param + "%");
					break;
				case 3:
					list = searchManufacturingEnterprise("%" + param + "%");
					break;
				case 4:
					list = searchAll("%" + param + "%");
					break;
				default:
					break;
				}
				natureMap.put(term.getNatureStr(), list);
				valueMap.put(term.getNatureStr(), param);
			}
		}
		for (String nature : natureMap.keySet()) {
			if ("vn".equals(nature)) {
				ListUtil.add2List(all, natureMap.get(nature));
			} else if ("n".equals(nature)) {
				ListUtil.add2List(all, natureMap.get(nature));
			} else {
				for (Medicine m : natureMap.get(nature)) {
					if (valueMap.get("vn") != null) {
						switch (type) {
						case 0:
							if (m.getDrugName().contains(valueMap.get("vn"))) {
								all.add(m);
							}
							break;
						case 1:
							if (m.getUseForIllness().contains(valueMap.get("vn"))) {
								all.add(m);
							}
							break;
						case 2:
							if (m.getBrand().contains(valueMap.get("vn"))) {
								all.add(m);
							}
							break;
						case 3:
							if (m.getManufacturer().contains(valueMap.get("vn"))) {
								all.add(m);
							}
							break;
						case 4:
							if ((m.getDrugName().contains(valueMap.get("vn")))
									|| (m.getUseForIllness().contains(valueMap.get("vn")))
									|| (m.getBrand().contains(valueMap.get("vn")))
									|| (m.getManufacturer().contains(valueMap.get("vn")))) {
								all.add(m);
							}
							break;
						default:
							break;
						}
					} else if (valueMap.get("n") != null) {
						switch (type) {
						case 0:
							if (m.getDrugName().contains(valueMap.get("n"))) {
								all.add(m);
							}
							break;
						case 1:
							if (m.getUseForIllness().contains(valueMap.get("n"))) {
								all.add(m);
							}
							break;
						case 2:
							if (m.getBrand().contains(valueMap.get("n"))) {
								all.add(m);
							}
							break;
						case 3:
							if (m.getManufacturer().contains(valueMap.get("n"))) {
								all.add(m);
							}
							break;
						case 4:
							if ((m.getDrugName().contains(valueMap.get("n")))
									|| (m.getUseForIllness().contains(valueMap.get("n")))
									|| (m.getBrand().contains(valueMap.get("n")))
									|| (m.getManufacturer().contains(valueMap.get("n")))) {
								all.add(m);
							}
							break;
						default:
							break;
						}
					} else {
						ListUtil.add2List(all, natureMap.get(nature));
					}

				}
			}

		}

	}

	private List<Medicine> searchAll(String name) {
		// TODO Auto-generated method stub
		List<Medicine> all = new ArrayList<>();
		ListUtil.add2List(all, searchGenericName(name));
		ListUtil.add2List(all, searchMajorFunctions(name));
		ListUtil.add2List(all, searchBrand(name));
		ListUtil.add2List(all, searchManufacturingEnterprise(name));
		return all;
	}

	@Override
	public List<Medicine> search(String content, int type) {
		// TODO Auto-generated method stub
		List<Medicine> all = new ArrayList<>();
		SmartForest<List<String>> smartForest = SynonymsLibrary.get();
		System.out.println(smartForest);
		if(smartForest!=null) {
			SmartForest<List<String>> branchs = smartForest.getBranch(content);
			List<String> params = branchs == null ? null : branchs.getParam();
			if (params != null) {
				for (String param : params) {
					ListUtil.add2List(all, searchAll("%" + param + "%"));
				}
			} else {
				ListUtil.add2List(all, searchAll("%" + content + "%"));
			}

			if (!all.isEmpty()) {
				return all;
			}
			List<Term> terms = ToAnalysis.parse(content).getTerms();
//			Collections.sort(terms);
			for (Term term : terms) {
				List<Medicine> list = searchByTerm(type, all, term);
				if(!list.isEmpty()) {
					ListUtil.add2List(list, all);
					//当搜到药就返回
					return all;
				}
			}
		}
		
		return all;
	}

	/**
	 * 根据term（关键字）查询药品
	 * @param type
	 * @param all
	 * @param term
	 * @return
	 */
	private List<Medicine> searchByTerm(int type, List<Medicine> all, Term term) {
		String content = term.getName();
		SmartForest<List<String>> branchs = SynonymsLibrary.get().getBranch(content);
		List<String> params = branchs == null ? null : branchs.getParam();
		List<Medicine> list = new ArrayList<>();
		if (params != null) {
			for (String param : params) {
				switch (type) {
				case 0:
					ListUtil.add2List(list, searchGenericName("%" + param + "%"));
					break;
				case 1:
					ListUtil.add2List(list, searchMajorFunctions("%" + param + "%"));
					break;
				case 2:
					ListUtil.add2List(list, searchBrand("%" + param + "%"));
					break;
				case 3:
					ListUtil.add2List(list, searchManufacturingEnterprise("%" + param + "%"));
					break;
				case 4:
					ListUtil.add2List(list, searchAll("%" + param + "%"));
					break;
				default:
					break;
				}
			}
		}
		return list;
	}

}

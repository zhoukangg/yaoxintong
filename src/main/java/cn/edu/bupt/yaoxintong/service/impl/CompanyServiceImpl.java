package cn.edu.bupt.yaoxintong.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.MRCMapper;
import cn.edu.bupt.yaoxintong.dao.MedicineCompanyMapper;
import cn.edu.bupt.yaoxintong.pojo.MRC;
import cn.edu.bupt.yaoxintong.pojo.MRCExample;
import cn.edu.bupt.yaoxintong.pojo.Medicine;
import cn.edu.bupt.yaoxintong.pojo.MedicineCompany;
import cn.edu.bupt.yaoxintong.pojo.MedicineCompanyExample;
import cn.edu.bupt.yaoxintong.service.CompanyService;
import cn.edu.bupt.yaoxintong.util.ListUtil;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	MedicineCompanyMapper medicineCompanyMapper;
	@Autowired
	MRCMapper mrcMapper;

	@Override
	public List<MedicineCompany> searchCompanyName(String word) {
		// TODO Auto-generated method stub
		MedicineCompanyExample example = new MedicineCompanyExample();
		example.createCriteria().andCompanyNameLike(word);
		return medicineCompanyMapper.selectByExample(example);
	}

	@Override
	public List<MedicineCompany> searchCompanyProvince(String word) {
		// TODO Auto-generated method stub
		MedicineCompanyExample example = new MedicineCompanyExample();
		example.createCriteria().andProvincesCitiesLike(word);
		return medicineCompanyMapper.selectByExample(example);
	}

	@Override
	public List<MedicineCompany> searchCompanyRange(String word) {
		// TODO Auto-generated method stub
		MedicineCompanyExample example = new MedicineCompanyExample();
		example.createCriteria().andProductionRangeLike(word);
		return medicineCompanyMapper.selectByExample(example);
	}

	@Override
	public MedicineCompany searchById(String id) {
		// TODO Auto-generated method stub
		return medicineCompanyMapper.selectByPrimaryKey(id);
	}

	@Override
	public MedicineCompany getCompanyByName(String name) {
		// TODO Auto-generated method stub
		MedicineCompanyExample example = new MedicineCompanyExample();
		example.createCriteria().andCompanyNameEqualTo(name);
		List<MedicineCompany> list = medicineCompanyMapper.selectByExample(example);
		return list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public List<MedicineCompany> getCompanysByName(String name) {
		// TODO Auto-generated method stub
		MedicineCompanyExample example = new MedicineCompanyExample();
		example.createCriteria().andCompanyNameEqualTo(name);
		List<MedicineCompany> list = medicineCompanyMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<MedicineCompany> getMapDatas(Medicine medicine, String relationship) {
		MRCExample example = new MRCExample();
		example.createCriteria().andMIdEqualTo(medicine.getId()).andRelationEqualTo(relationship);
		List<MRC> mrcs = mrcMapper.selectByExample(example);
		List<MedicineCompany> list = new ArrayList<MedicineCompany>();
		for (MRC mrc : mrcs) {
			MedicineCompany searchById = searchById(mrc.getcId());
			list.add(searchById);
		}
		return list;
	}

	@Override
	public List<MedicineCompany> searchByProductionAddress(String productionAddress, String province) {
		MedicineCompanyExample example1 = new MedicineCompanyExample();
		example1.createCriteria().andProductionAddressEqualTo(productionAddress);
		MedicineCompanyExample example2 = new MedicineCompanyExample();
		example2.createCriteria().andProductionAddressGreaterThanOrEqualTo(province);
		List<MedicineCompany> l1 = medicineCompanyMapper.selectByExample(example1);
		List<MedicineCompany> l2 = medicineCompanyMapper.selectByExample(example2);
		ListUtil.add2List(l1, l2);
		return l1;
	}

	@Override
	public List<MedicineCompany> getHotCompanys() {
		// TODO Auto-generated method stub
		
		MedicineCompanyExample example = new MedicineCompanyExample();
		example.createCriteria().andHotGreaterThan(0);
		return medicineCompanyMapper.selectByExample(example);
	}

}

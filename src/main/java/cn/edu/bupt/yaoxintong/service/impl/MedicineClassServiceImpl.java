package cn.edu.bupt.yaoxintong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.edu.bupt.yaoxintong.dao.MedicineClassMapper;
import cn.edu.bupt.yaoxintong.pojo.MedicineClass;
import cn.edu.bupt.yaoxintong.pojo.MedicineClassExample;
import cn.edu.bupt.yaoxintong.service.MedicineClassService;
import cn.edu.bupt.yaoxintong.util.StringUtil;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月25日 下午9:56:29
* 
* 类说明 
*/
@Service
public class MedicineClassServiceImpl implements MedicineClassService {

	@Autowired public MedicineClassMapper medicineClassMapper;
	
	@Override
	public int addMedicineClass(MedicineClass medicineClass) {
		// TODO Auto-generated method stub @author 
		return medicineClassMapper.insert(medicineClass);
	}

	@Override
	public int deleteMedicineClass(Integer id) {
		// TODO Auto-generated method stub @author 作者wydewy
		return medicineClassMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateMedicineClass(MedicineClass medicineClass) {
		// TODO Auto-generated method stub @author 作者wydewy
		MedicineClass origin = getMedicineClass(medicineClass.getId());
		if(StringUtil.isEmpty(medicineClass.getName())){
			medicineClass.setName(origin.getName());
		}
		if(medicineClass.getFarther()==null){
			medicineClass.setFarther(origin.getFarther());
		}
		if(medicineClass.getLevel()==null){
			medicineClass.setLevel(origin.getLevel());
		}
		return medicineClassMapper.updateByPrimaryKey(medicineClass);
	}

	@Override
	public MedicineClass getMedicineClass(Integer id) {
		// TODO Auto-generated method stub @author 作者wydewy
		return medicineClassMapper.selectByPrimaryKey(id);
	}

	@Override
	public MedicineClass getMedicineClassByNsame(String name) {
		// TODO Auto-generated method stub @author 作者wydewy
		
		MedicineClassExample example = new MedicineClassExample();
		List<MedicineClass> list = medicineClassMapper.selectByExample(example);
		MedicineClass medicineClass = list.size()>0?list.get(0):null;
		return medicineClass;
	}

	@Override
	public List<MedicineClass> getMedicineClassByLevel(Integer level,int page ,int num) {
		// TODO Auto-generated method stub @author 作者wydewy
		MedicineClassExample example = new MedicineClassExample();
		example.createCriteria().andLevelEqualTo(level);
		PageHelper.startPage(page, num);
		List<MedicineClass> list = medicineClassMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<MedicineClass> getMedicineClassByFather(Integer id) {
		// TODO Auto-generated method stub @author 作者wydewy
		MedicineClassExample example = new MedicineClassExample();
		example.createCriteria().andFartherEqualTo(id);		
		List<MedicineClass> list = medicineClassMapper.selectByExample(example);
		return list;
	}


}

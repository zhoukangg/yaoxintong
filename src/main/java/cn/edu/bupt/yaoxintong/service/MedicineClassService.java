package cn.edu.bupt.yaoxintong.service;

import java.util.List;

import cn.edu.bupt.yaoxintong.pojo.MedicineClass;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月25日 下午9:51:25
* 
* 类说明:药品分类接口
*/
public interface MedicineClassService {
	
	/**
	 * 添加药品分类
	 * @param medicineClass 要添加的药品分类
	 * @return
	 */
	int addMedicineClass(MedicineClass medicineClass);
	/**
	 * 删除药品分类
	 * @param id 要删除的药品分类
	 * @return
	 */
	int deleteMedicineClass(Integer id);
	/**
	 * 更新药品分类数据
	 * @param medicineClass 带更新数据的药品分类，根据id进行更新，id不允许为空否则报错
	 * @return
	 */
	int updateMedicineClass(MedicineClass medicineClass);
	/**
	 * 根据id查询药品分类信息
	 * @param id 获得药品分类信息
	 * @return
	 */
	MedicineClass getMedicineClass(Integer id);
	/**
	 * 根据药品分类名查询药品分类
	 * @param name 
	 * @return
	 */
	MedicineClass getMedicineClassByNsame(String name);
	
	/**
	 * 根据药品分类级别查询药品分类
	 * @param name 
	 * @return
	 */
	List<MedicineClass>  getMedicineClassByFather(Integer father); 
	
	/**
	 * 根据父级分类查询药品分类
	 * @param name 
	 * @return
	 */
	List<MedicineClass> getMedicineClassByLevel(Integer level, int page, int num);
}

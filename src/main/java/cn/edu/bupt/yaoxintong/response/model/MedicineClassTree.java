package cn.edu.bupt.yaoxintong.response.model;

import java.util.List;

import cn.edu.bupt.yaoxintong.pojo.MedicineClass;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月28日 下午2:40:17
* 
* 类说明 
*/
public class MedicineClassTree {
	private MedicineClass medicineClass;
	private List<MedicineClassTree> sons;
	public MedicineClass getMedicineClass() {
		return medicineClass;
	}
	public void setMedicineClass(MedicineClass medicineClass) {
		this.medicineClass = medicineClass;
	}
	public List<MedicineClassTree> getSons() {
		return sons;
	}
	public void setSons(List<MedicineClassTree> sons) {
		this.sons = sons;
	}
	
}

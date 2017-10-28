package cn.edu.bupt.yaoxintong.response.model;

import java.util.List;

import cn.edu.bupt.yaoxintong.pojo.MedicineClass;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月29日 下午6:16:27
* 
* 类说明 
*/
public class FloorMedicineClass {
	
	private String name;
	private List<MedicineClass> medicineClasses;
	private List<BriefMedicineInfo> briefMedicineInfo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<MedicineClass> getMedicineClasses() {
		return medicineClasses;
	}
	public void setMedicineClasses(List<MedicineClass> medicineClasses) {
		this.medicineClasses = medicineClasses;
	}
	/**
	 * @return the briefMedicineInfo
	 */
	public List<BriefMedicineInfo> getBriefMedicineInfo() {
		return briefMedicineInfo;
	}
	/**
	 * @param briefMedicineInfo the briefMedicineInfo to set
	 */
	public void setBriefMedicineInfo(List<BriefMedicineInfo> briefMedicineInfo) {
		this.briefMedicineInfo = briefMedicineInfo;
	}
	
}

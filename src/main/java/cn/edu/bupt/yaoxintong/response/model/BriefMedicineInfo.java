package cn.edu.bupt.yaoxintong.response.model;
/** 
* @author 作者wydewy
* @version 创建时间：2017年8月1日 上午11:17:32
* 
* 类说明 
*/
public class BriefMedicineInfo {
	private String medicineId;
	private String path;
	private String price;
	private String name;
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the medicineId
	 */
	public String getMedicineId() {
		return medicineId;
	}
	/**
	 * @param medicineId the medicineId to set
	 */
	public void setMedicineId(String medicineId) {
		this.medicineId = medicineId;
	}
	

}

package cn.edu.bupt.yaoxintong.response.model;

import java.util.List;

import cn.edu.bupt.yaoxintong.pojo.ContactInformation;
import cn.edu.bupt.yaoxintong.pojo.YaoxintongBusiness;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月31日 上午10:58:09
* 
* 类说明 
*/
public class BusinessInfo {
	private YaoxintongBusiness user;
	private List<ContactInformation> contactInformation;
	
	/**
	 * @return the contractInformation
	 */
	public List<ContactInformation> getContactInformation() {
		return contactInformation;
	}
	/**
	 * @param contractInformation the contractInformation to set
	 */
	public void setContactInformation(List<ContactInformation> contractInformation) {
		this.contactInformation = contractInformation;
	}
	/**
	 * @return the user
	 */
	public YaoxintongBusiness getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(YaoxintongBusiness user) {
		this.user = user;
	}
}

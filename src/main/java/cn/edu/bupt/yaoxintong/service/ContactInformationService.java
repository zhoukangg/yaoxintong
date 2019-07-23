package cn.edu.bupt.yaoxintong.service;

import java.util.List;

import cn.edu.bupt.yaoxintong.pojo.ContactInformation;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月25日 上午10:14:51
* 
* 类说明 
*/
public interface ContactInformationService {
	int addContactInformation(ContactInformation information);
	List<ContactInformation> getContactInfomation(String userId);
	List<ContactInformation> getContactInfomation(String userId,String type);
	int updateContactInfomation(ContactInformation record);
	
	ContactInformation getContactEmail(String user_id);
	List<ContactInformation> getContact(String user_id);
	ContactInformation getContactPhone(String user_id);
	int updateContactInformation(String user_id, String email, String phone);
	
	
	
}

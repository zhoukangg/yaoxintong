package cn.edu.bupt.yaoxintong.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.ContactInformationMapper;
import cn.edu.bupt.yaoxintong.pojo.ContactInformation;
import cn.edu.bupt.yaoxintong.pojo.ContactInformationExample;
import cn.edu.bupt.yaoxintong.service.ContactInformationService;
import cn.edu.bupt.yaoxintong.util.Constant;
import cn.edu.bupt.yaoxintong.util.StringUtil;

@Service
public class ContactInfomationServiceImpl implements ContactInformationService {
	    @Autowired ContactInformationMapper contactInformationMapper;
	    ContactInformationService contactInformationService;
		@Override
		public List<ContactInformation> getContact(String user_id) {
			ContactInformationExample example=new ContactInformationExample();
			example.createCriteria().andUserIdEqualTo(user_id);
			
			return contactInformationMapper.selectByExample(example);
		}

		@Override
		public ContactInformation getContactEmail(String user_id) {
			ContactInformationExample example=new ContactInformationExample();
			example.createCriteria().andUserIdEqualTo(user_id).andTypeEqualTo(Constant.CONTACT_INFO_TYPE_EMAIL);
			return contactInformationMapper.selectByExample(example).get(0);
		}

		
		@Override
		public ContactInformation getContactPhone(String user_id) {
			ContactInformationExample example=new ContactInformationExample();
			example.createCriteria().andUserIdEqualTo(user_id).andTypeEqualTo(Constant.CONTACT_INFO_TYPE_PHONE);
			List<ContactInformation> contactInformations = contactInformationMapper.selectByExample(example);
			return contactInformations.size()>0?contactInformations.get(0):null;
		}

		
	@Override
		public int updateContactInformation(String user_id, String email, String phone) {
		   
		System.out.println(phone);
			ContactInformationExample example=new ContactInformationExample();
			example.createCriteria().andUserIdEqualTo(user_id).andTypeEqualTo(Constant.CONTACT_INFO_TYPE_EMAIL);
			List<ContactInformation> list1 =contactInformationMapper.selectByExample(example);
		
			int i1=0,i2=0;
			
			if(!StringUtil.isEmpty(email))
			{
			
				ContactInformation emailInformation = new ContactInformation();

				emailInformation.setUserId(user_id);
				emailInformation.setContactInfo(email);
				emailInformation.setContactType(Constant.CONTACTTYPE_BUSINESS);
				emailInformation.setType(Constant.CONTACT_INFO_TYPE_EMAIL);
				emailInformation.setUpdateTime(new Date());
				
				if(list1.isEmpty())
				{
					i1 = contactInformationMapper.insert(emailInformation);
				}
				else
				{
					emailInformation.setId(list1.get(0).getId());
					ContactInformationExample example1=new ContactInformationExample();
					example1.createCriteria().andUserIdEqualTo(emailInformation.getUserId()).andTypeEqualTo(emailInformation.getType());
					
					//为什么下面语句执行不了(注意type类型)
					i1=contactInformationMapper.updateByExampleSelective(emailInformation, example1);
					
				}
			}
			
			ContactInformationExample example2=new ContactInformationExample();
			example2.createCriteria().andUserIdEqualTo(user_id).andTypeEqualTo(Constant.CONTACT_INFO_TYPE_PHONE);
			List<ContactInformation> list2 =contactInformationMapper.selectByExample(example);
			if (!StringUtil.isEmpty(phone))
			{
				ContactInformation phoneInformation = new ContactInformation();
				phoneInformation.setUserId(user_id);
				phoneInformation.setContactInfo(phone);
				phoneInformation.setContactType(Constant.CONTACTTYPE_BUSINESS);
				phoneInformation.setType(Constant.CONTACT_INFO_TYPE_PHONE);
				phoneInformation.setUpdateTime(new Date());
				
				if(list2==null)
				{
					i2 = contactInformationMapper.insert(phoneInformation);	
				}
				else 
				{
					ContactInformationExample example3=new ContactInformationExample();
					example3.createCriteria().andUserIdEqualTo(user_id).andTypeEqualTo(Constant.CONTACT_INFO_TYPE_PHONE);
					i2=contactInformationMapper.updateByExampleSelective(phoneInformation, example3);
				}
			}
			
			
			if(i1!=0&&i2!=0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
					
		  }

	@Override
	public int addContactInformation(ContactInformation information) {
		// TODO Auto-generated method stub @author 作者wydewy
		return contactInformationMapper.insert(information);
	}

	@Override
	public List<ContactInformation> getContactInfomation(String userId) {
		// TODO Auto-generated method stub @author 作者wydewy
		ContactInformationExample example = new ContactInformationExample();
		example.createCriteria().andUserIdEqualTo(userId);
		return contactInformationMapper.selectByExample(example);
	}

	@Override
	public int updateContactInfomation(ContactInformation record) {
		// TODO Auto-generated method stub @author 作者wydewy
		int i = contactInformationMapper.updateByPrimaryKey(record);
		return i;
	}

	@Override
	public List<ContactInformation> getContactInfomation(String userId, String type) {
		// TODO Auto-generated method stub @author 作者wydewy
		
		ContactInformationExample example = new ContactInformationExample();
		example.createCriteria().andUserIdEqualTo(userId).andTypeEqualTo(type);
		return contactInformationMapper.selectByExample(example);
	}
    
		

}

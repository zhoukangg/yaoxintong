package cn.edu.bupt.yaoxintong.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.edu.bupt.yaoxintong.pojo.CompanyInfoExample.Criteria;
import cn.edu.bupt.yaoxintong.dao.CompanyInfoMapper;
import cn.edu.bupt.yaoxintong.pojo.CompanyInfo;
import cn.edu.bupt.yaoxintong.pojo.CompanyInfoExample;
import cn.edu.bupt.yaoxintong.service.CompanyInfoSevice;
import cn.edu.bupt.yaoxintong.util.ReturnModel;
import cn.edu.bupt.yaoxintong.util.StringUtil;

@Service
public class CompanyInfoSeviceImpl implements CompanyInfoSevice {
	
	@Autowired CompanyInfoMapper companyInfoMapper;
	
	/**
	 * 根据id获取公司信息记录
	 */
	@Override
	public ReturnModel getComInfo(String id) 
	{
		ReturnModel result = new ReturnModel();
		CompanyInfo list = companyInfoMapper.selectByPrimaryKey(id);
		// TODO Auto-generated method stub
		result.setResult(list!=null);
        result.setDatum(list);
        return result;
	}

	/**
	 * 获取所有的公司信息记录
	 */
	@Override
	public ReturnModel  getAllComInfo() 
	{
		ReturnModel result = new ReturnModel();
		CompanyInfoExample example=new CompanyInfoExample();
		List<CompanyInfo> list=companyInfoMapper.selectByExample(example);
		result.setResult(list!=null);
        result.setDatum(list);
        return result;
	}
	
	/**
	 * 根据id修改公司信息记录
	 */
	@Override
	public ReturnModel modifyComInfo(String id, String company_name,String phone_numble, String address,String disclaimer)
	{
		ReturnModel result = new ReturnModel();
		if(StringUtil.isEmpty(id))
		{
			result.setResult(false);
	        result.setDatum(0);
	        return result;
		}
		CompanyInfo companyInfo = companyInfoMapper.selectByPrimaryKey(id);
		if(StringUtil.isNotEmpty(company_name))
		{
			companyInfo.setCompanyName(company_name);
		}
		if(StringUtil.isNotEmpty(phone_numble))
		{
			companyInfo.setPhoneNumble(phone_numble);
		}
		if(StringUtil.isNotEmpty(address))
		{
			companyInfo.setAddress(address);
		}
		if(StringUtil.isNotEmpty(disclaimer))
		{
			companyInfo.setDisclaimer(disclaimer);
		}
		
		int i = companyInfoMapper.updateByPrimaryKey(companyInfo);	
		result.setResult(i>0);
        result.setDatum(i);
        return result;
	}
	
	/**
	 * 
	 * 新增公司信息记录
	 */
	@Override
	public ReturnModel increaseComInfo(String company_name,String phone_numble, String address,String disclaimer)
	{
		ReturnModel result = new ReturnModel();
		if(StringUtil.isEmpty(company_name) || StringUtil.isEmpty(phone_numble) || StringUtil.isEmpty(address) || StringUtil.isEmpty(disclaimer))
		{
			result.setResult(false);
	        result.setDatum(0);
	        return result;
		}
		CompanyInfo record=new CompanyInfo();
		record.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		record.setCompanyName(company_name);
		record.setPhoneNumble(phone_numble);
		record.setAddress(address);
		record.setDisclaimer(disclaimer);
		int i=companyInfoMapper.insert(record);
		result.setResult(i>0);
        result.setDatum(i);
        return result;
	}

	/**
	 * 根据id删除公司信息记录
	 */
	@Override
	public ReturnModel deleteComInfo(String id) {
		// TODO Auto-generated method stub
		ReturnModel result = new ReturnModel();
		CompanyInfoExample example =new CompanyInfoExample();
		Criteria creatCriteria=example.createCriteria();
		creatCriteria.andIdEqualTo(id);
		int i = companyInfoMapper.deleteByExample(example);
		result.setResult(i>0);
        result.setDatum(i);
        return result;
	}
}

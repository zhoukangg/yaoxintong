package cn.edu.bupt.yaoxintong.service;

import cn.edu.bupt.yaoxintong.util.ReturnModel;

public interface CompanyInfoSevice {
	ReturnModel getComInfo(String id);
	ReturnModel   getAllComInfo();
	ReturnModel modifyComInfo( String id, String company_name,String phone_numble, String address,String disclaimer);
	ReturnModel increaseComInfo(String company_name,String phone_numble, String address,String disclaimer);
	ReturnModel deleteComInfo(String id);
}

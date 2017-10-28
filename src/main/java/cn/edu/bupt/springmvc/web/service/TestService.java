package cn.edu.bupt.springmvc.web.service;

import java.util.List;

import cn.edu.bupt.springmvc.web.model.Test;

public interface TestService {

	int insert(Test record);

	List<Test> selectByExample();

	List<Test> selectByPage(int page,int rows);
	
}

package cn.edu.bupt.springmvc.web.service.impl;

import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.edu.bupt.springmvc.web.dao.TestMapper;
import cn.edu.bupt.springmvc.web.model.Test;
import cn.edu.bupt.springmvc.web.model.TestExample;
import cn.edu.bupt.springmvc.web.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	@Resource
	private TestMapper testMapper;
	
	private TestExample testExample;
	
	@Override
	public int insert(Test record) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		record.setAge(rand.nextInt(100)+1);
		return testMapper.insert(record);
	}

	@Override
	public List<Test> selectByExample() {
		// TODO Auto-generated method stub
		testExample = new TestExample();
		testExample.createCriteria().andNameEqualTo("zhangsan").andAgeBetween(20, 25);
		List<Test> list = testMapper.selectByExample(testExample);
		return list;
	}

	@Override
	public List<Test> selectByPage(int page,int rows) {
		// TODO Auto-generated method stub
		testExample = new TestExample();
		PageHelper.startPage(page, rows);
		List<Test> list = testMapper.selectByExample(testExample);
		return list;
	}
	
	
}

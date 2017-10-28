package cn.edu.bupt.springmvc.web.controller;



import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.bupt.springmvc.core.generic.GenericController;
import cn.edu.bupt.springmvc.web.model.Test;
import cn.edu.bupt.springmvc.web.service.TestService;
@Controller
@RequestMapping(value="test")
public class TestController extends GenericController{
	@Resource
	private TestService testService;
	
	@RequestMapping(value="insert", method=RequestMethod.GET)
	public void insertTest(HttpServletResponse response,Test record) {
		int i = testService.insert(record);
		if(i>0) {
			renderSuccessString(response,record);
		} else {
			renderErrorString(response,"insert test error");
		}
	}
	
	@RequestMapping(value="selectByExample")
	public void selectTest(HttpServletResponse response) {
		List<Test> list = testService.selectByExample();
		if(list != null) {
			renderSuccessString(response,list);
		} else {
			renderErrorString(response,"no data");
		}
	}
	
	@RequestMapping(value="selectByPage")
	public void selectByPage(HttpServletResponse response,
			@RequestParam(required = false, defaultValue = "1") int page,
            @RequestParam(required = false, defaultValue = "10") int rows) {
		List<Test> list = testService.selectByPage(page,rows);
		if(list != null) {
			renderSuccessString(response,list);
		} else {
			renderErrorString(response,"no date");
		}
	}
}

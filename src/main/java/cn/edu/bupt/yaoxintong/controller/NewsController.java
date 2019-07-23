package cn.edu.bupt.yaoxintong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.bupt.yaoxintong.pojo.News;
import cn.edu.bupt.yaoxintong.service.NewsService;
import cn.edu.bupt.yaoxintong.util.Logger;
import cn.edu.bupt.yaoxintong.util.ReturnModel;

@Controller
@RequestMapping("news")
public class NewsController {
	
	private static final Logger logger = Logger.getInstance();
	@Autowired
	NewsService newsService;

	// 获取热销商品
	@RequestMapping(value = "/get/", method = RequestMethod.POST)
	public @ResponseBody ReturnModel getHot(HttpServletResponse response, HttpServletRequest request) {
		logger.info("======进入了NewsController getHot()");
		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");

		ReturnModel result = new ReturnModel();
		try{
			List<News> newses = newsService.getNews();
			result.setDatum(newses);
		}catch (Exception e){
			e.printStackTrace();
		}
		result.setResult(true);
		return result;
	}

}

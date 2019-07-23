package cn.edu.bupt.yaoxintong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.NewsMapper;
import cn.edu.bupt.yaoxintong.pojo.News;
import cn.edu.bupt.yaoxintong.pojo.NewsExample;
import cn.edu.bupt.yaoxintong.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	NewsMapper newsMapper;
	
	@Override
	public List<News> getNews() {
		NewsExample example = new NewsExample();
		List<News> newses = newsMapper.selectByExample(example);
		return newses;
	}

}

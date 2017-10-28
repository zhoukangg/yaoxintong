package cn.edu.bupt.yaoxintong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.ViewPagerMapper;
import cn.edu.bupt.yaoxintong.pojo.ViewPager;
import cn.edu.bupt.yaoxintong.pojo.ViewPagerExample;
import cn.edu.bupt.yaoxintong.service.ViewpagerService;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月31日 下午9:20:17
* 
* 类说明 
*/
@Service
public class ViewpagerServiceImpl implements ViewpagerService {

	
	@Autowired ViewPagerMapper viewPagerMapper;
	
	@Override
	public List<ViewPager> getAllViewpagers(int start, int end) {
		ViewPagerExample example = new ViewPagerExample();
		example.createCriteria().andIdGreaterThan(start).andIdLessThan(end);
		return viewPagerMapper.selectByExample(example);
	}

}

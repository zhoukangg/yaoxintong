package cn.edu.bupt.yaoxintong.service;

import java.util.List;

import cn.edu.bupt.yaoxintong.pojo.ViewPager;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月31日 下午9:19:32
* 
* 类说明 
*/
public interface ViewpagerService {
	List<ViewPager> getAllViewpagers(int start, int end);
}

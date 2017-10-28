package cn.edu.bupt.yaoxintong.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.bupt.yaoxintong.pojo.Picture;
import cn.edu.bupt.yaoxintong.pojo.ViewPager;
import cn.edu.bupt.yaoxintong.response.model.ViewPageData;
import cn.edu.bupt.yaoxintong.service.MedicineService;
import cn.edu.bupt.yaoxintong.service.PictureService;
import cn.edu.bupt.yaoxintong.service.ViewpagerService;
import cn.edu.bupt.yaoxintong.util.ReturnModel;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月31日 下午9:18:00
* 
* 类说明 顶部轮播图
*/
@Controller
@RequestMapping("/mainframe")
public class ViewPagerController {

	@Autowired ViewpagerService viewPagerService;
	@Autowired PictureService  pictureService;
	@Autowired MedicineService  medicineService;
	
	/**
	 * 获取顶部轮播图
	 * @param start 
	 * @param end 
	 * @return
	 */
	@RequestMapping(value = "/get_top_view_pager", method = RequestMethod.POST)
	public @ResponseBody ReturnModel getTopViewPager(HttpServletRequest request,HttpServletResponse response, int start, int end) {
		
		ReturnModel result = new ReturnModel();
		
		//解决Ajax跨域请求问题
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        
       
        
        List<ViewPageData> viewPageDatas = new ArrayList<ViewPageData>();
        
        List<ViewPager> allViewpagers = viewPagerService.getAllViewpagers(start, end);
        
        for(ViewPager v :allViewpagers){
        	 ViewPageData viewPageData = new ViewPageData();
        	 Picture picture = pictureService.getPictureById(v.getPictureId());
        	 if(picture!=null){
        		 viewPageData.setImageUrl(picture.getPath());
        		 viewPageData.setMedicineId(v.getMedicineId());
            	 viewPageDatas.add(viewPageData);
        	 }
        }
        result.setResult(true);
        result.setDatum(viewPageDatas);
        
    	return result;	
	}
	
}

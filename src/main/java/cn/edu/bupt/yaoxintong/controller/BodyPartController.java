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

import cn.edu.bupt.yaoxintong.pojo.custom.BodyPart;
import cn.edu.bupt.yaoxintong.response.model.BodyPartSymptom;
import cn.edu.bupt.yaoxintong.service.BodyPartService;
import cn.edu.bupt.yaoxintong.util.ReturnModel;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月31日 下午9:58:20
* 
* 类说明 
*/
@Controller
@RequestMapping("/mainframe")
public class BodyPartController {
	@Autowired BodyPartService bodyPartService;
	
	@RequestMapping(value = "/get_body_part", method = RequestMethod.POST)
	public @ResponseBody ReturnModel getTopViewPager(HttpServletRequest request,HttpServletResponse response){
		ReturnModel result = new ReturnModel();
		
		//解决Ajax跨域请求问题
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        
        
        List<BodyPartSymptom> bodyPartSymptoms = new ArrayList<BodyPartSymptom>();
        
        List<BodyPart> bodyParts = bodyPartService.getBodyParts();
        for(BodyPart part:bodyParts){
        	BodyPartSymptom bodyPartSymptom = new BodyPartSymptom();
        	bodyPartSymptom.setPart(part.getPart());
        	List<BodyPart> Parts = bodyPartService.getBodyPartsByPart(part.getPart());
			bodyPartSymptom.setBodyParts(Parts);
			bodyPartSymptoms.add(bodyPartSymptom);
        }
        
		result.setResult(true);
		result.setDatum(bodyPartSymptoms);
		return result;
	}
	
}

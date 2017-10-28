package cn.edu.bupt.yaoxintong.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.bupt.yaoxintong.pojo.MedicineClass;
import cn.edu.bupt.yaoxintong.response.model.MedicineClassTree;
import cn.edu.bupt.yaoxintong.service.FloorService;
import cn.edu.bupt.yaoxintong.service.MedicineClassService;
import cn.edu.bupt.yaoxintong.service.PictureService;
import cn.edu.bupt.yaoxintong.util.Constant;
import cn.edu.bupt.yaoxintong.util.ReturnModel;
import cn.edu.bupt.yaoxintong.util.StringUtil;


/**
 * @author 作者wydewy
 * @version 创建时间：2017年7月25日 下午10:14:47
 * 
 *类说明:药品类别控制器
 */
@Controller
@RequestMapping("/medicine_class")
public class MedicineClassController {

	@Autowired MedicineClassService medicineClassService;
	
	@Autowired FloorService floorService;
	@Autowired PictureService pictureService;
	
	private static final Logger logger = Logger.getLogger(MedicineClassController.class);
	
	/**
	 * @author 作者wydewy
	 * 添加药品分类
	 * @param name
	 * @param farther
	 * @param level
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody ReturnModel add(String name, Integer farther, Integer level) {
		
		logger.info("======进入了MedicineClassController的/add方法，参数：name = " + name+" farther = "+ farther
		+" level = "+ level);
		
		ReturnModel result = new ReturnModel();

		if (StringUtil.isEmpty(name)) {
			result.setResult(false);
			result.setReason(Constant.REASON_CLASS_NAME_IS_NULL);
			return result;
		}

		if (farther==null) {
			result.setResult(false);
			result.setReason(Constant.REASON_CLASS_FARTHER_IS_NULL);
			return result;
		}
		
		if (level==null) {
			result.setResult(false);
			result.setReason(Constant.REASON_CLASS_LEVEL_IS_NULL);
			return result;
		}
		
		MedicineClass medicineClass = new MedicineClass();
		medicineClass.setName(name);
		medicineClass.setFarther(farther);
		medicineClass.setLevel(level);
		int i = medicineClassService.addMedicineClass(medicineClass);
		result.setResult(i>0);
		return result;
	}
	
	
	/**
	 * @author 作者wydewy
	 * 删除药品分类
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public @ResponseBody ReturnModel delete(Integer id) {
		
		logger.info("======进入了MedicineClassController的/delete方法，参数：id = " + id);
		
		ReturnModel result = new ReturnModel();
		
		if (id==null) {
			result.setResult(false);
			result.setReason(Constant.REASON_CLASS_ID_IS_NULL);
			return result;
		}
		
		int i = medicineClassService.deleteMedicineClass(id);
		result.setResult(i>0);
		return result;
	}
	
	/**
	 * @author 作者wydewy
	 * 查询药品分类
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public @ResponseBody ReturnModel get(Integer id) {
		
		logger.info("======进入了MedicineClassController的/get方法，参数：id = " + id);
		
		ReturnModel result = new ReturnModel();
		
		if (id==null) {
			result.setResult(false);
			result.setReason(Constant.REASON_CLASS_ID_IS_NULL);
			return result;
		}
		
		MedicineClass medicineClass = medicineClassService.getMedicineClass(id);
		result.setResult(medicineClass!=null);
		result.setDatum(medicineClass);
		return result;
	}
	
	/**
	 * @author 作者wydewy
	 * 修改药品分类名称
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public @ResponseBody ReturnModel modify(Integer id,@RequestParam(value = "name", required = false)String name,
			@RequestParam(value = "farther", required = false)Integer farther,
			@RequestParam(value = "level", required = false)Integer level) {
		
		
		
		logger.info("======进入了MedicineClassController的/update方法，参数："
				+" name = "+ name
				+ " farther = " + farther
				+" level = "+ level);
				
		ReturnModel result = new ReturnModel();
		
		
		MedicineClass medicineClass = new MedicineClass();
		if (id==null) {
			result.setResult(false);
			result.setReason(Constant.REASON_CLASS_ID_IS_NULL);
			return result;
		}else{
			medicineClass.setId(id);
		}
		if(!StringUtil.isEmpty(name)){
			medicineClass.setName(name);
		}
		if(id!=null){
			medicineClass.setFarther(farther);
		}
		if(level!=null){
			medicineClass.setLevel(level);
		}
		int i = medicineClassService.updateMedicineClass(medicineClass);
		result.setResult(i>0);
		return result;
	}
	
	/**
	 * 获取顶部所有分类
	 * @param response 
	 * @return
	 */
	@RequestMapping(value = "/get_top", method = RequestMethod.POST)
	public @ResponseBody ReturnModel getTopMedicineClass(HttpServletRequest request,HttpServletResponse response) {
		
		//解决Ajax跨域请求问题
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
		
		ReturnModel result = new ReturnModel();
		List<MedicineClass> level1Classes = medicineClassService.getMedicineClassByLevel(1,1,12);
		
		//待返回的树状结构
		List<MedicineClassTree> medicineClassTrees = new ArrayList<>();
		
		for(MedicineClass level1Class:level1Classes){		
			MedicineClassTree medicineClassTree1 = new MedicineClassTree();
			medicineClassTree1.setMedicineClass(level1Class);
			medicineClassTrees.add(medicineClassTree1);//添加父节点
			
			List<MedicineClassTree> sons = new ArrayList<>();
			
			List<MedicineClass> level2Classes = medicineClassService.getMedicineClassByFather(level1Class.getId());			
			for(MedicineClass level2Class:level2Classes){
				MedicineClassTree medicineClassTree2 = new MedicineClassTree();
				medicineClassTree2.setMedicineClass(level2Class);
				sons.add(medicineClassTree2);//添加子节点
				
				List<MedicineClassTree> grandsons = new ArrayList<>();
				
				List<MedicineClass> level3Classes = medicineClassService.getMedicineClassByFather(level2Class.getId());				
				for(MedicineClass level3Class:level3Classes){
					MedicineClassTree medicineClassTree3 = new MedicineClassTree();
					medicineClassTree3.setMedicineClass(level3Class);
					grandsons.add(medicineClassTree3);	//添加孙节点	
				}
				medicineClassTree2.setSons(grandsons);
			}	
			medicineClassTree1.setSons(sons);
		}
		
		result.setDatum(medicineClassTrees);
		result.setResult(true);
		return result;
	}
}

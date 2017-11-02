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

import cn.edu.bupt.yaoxintong.pojo.Medicine;
import cn.edu.bupt.yaoxintong.pojo.MedicineCompany;
import cn.edu.bupt.yaoxintong.response.model.MapEdge;
import cn.edu.bupt.yaoxintong.response.model.MapModel;
import cn.edu.bupt.yaoxintong.response.model.MapNode;
import cn.edu.bupt.yaoxintong.service.CompanyService;
import cn.edu.bupt.yaoxintong.service.MedicineService;
import cn.edu.bupt.yaoxintong.util.Constant;
import cn.edu.bupt.yaoxintong.util.ListUtil;
import cn.edu.bupt.yaoxintong.util.Logger;
import cn.edu.bupt.yaoxintong.util.ReturnModel;
import cn.edu.bupt.yaoxintong.util.StringUtil;

@Controller
@RequestMapping("medicine")
public class MedicineController {

	private static final Logger logger = Logger.getInstance();
	@Autowired
	MedicineService medicineService;
	@Autowired
	CompanyService companyService;

	// 查询指定ID对应药品报告
		@RequestMapping(value = "/report/", method = RequestMethod.POST)
		public @ResponseBody ReturnModel report(String id, HttpServletResponse response, HttpServletRequest request) {
			logger.info("======进入了MedicineController的/getHot 参数 id="+id );
			// 解决Ajax跨域请求问题
			response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
			response.setHeader("Access-Control-Allow-Credentials", "true");

			ReturnModel result = new ReturnModel();
			//药品详细信息
			Medicine medicine = medicineService.searchById(id);
			// 获取制药企业
			List<MedicineCompany> proCompanys = companyService.getMapDatas(medicine, Constant.RELATION_PRO);
			// 获取卖药企业
			List<MedicineCompany> saleCompanys = companyService.getMapDatas(medicine, Constant.RELATION_SALE);
			String drugType3 = medicine.getDrugType3();
			List<Medicine> medicines = medicineService.searchByDrugType3(drugType3);
			
			
			
			return result;
		}
	
	// 获取热销商品
	@RequestMapping(value = "/getHot/", method = RequestMethod.POST)
	public @ResponseBody ReturnModel getHot(HttpServletResponse response, HttpServletRequest request) {
		logger.info("======进入了MedicineController的/getHot" );
		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");

		ReturnModel result = new ReturnModel();

		List<Medicine> medicines = medicineService.getHotMedicines();
		result.setDatum(medicines);
		result.setResult(true);
		return result;
	}

	// 查询指定ID对应药品详情
	@RequestMapping(value = "/detail/", method = RequestMethod.POST)
	public @ResponseBody ReturnModel detail(String id, HttpServletResponse response, HttpServletRequest request) {

		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");
		logger.info("======进入了MedicineController的/detail方法，参数：id = " + id );

		ReturnModel result = new ReturnModel();

		Medicine medicine = medicineService.searchById(id);
		result.setDatum(medicine);
		result.setResult(true);
		return result;
	}

	// 查询指定ID对应药品详情
	@RequestMapping(value = "/search/", method = RequestMethod.POST)
	public @ResponseBody ReturnModel search(Integer search_type, String word, HttpServletResponse response,
			HttpServletRequest request) {

		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");

		ReturnModel result = new ReturnModel();
		if (search_type == null) {
			result.setReason("搜索类型为空");
			result.setResult(false);
			return result;
		}

		if (StringUtil.isEmpty(word)) {
			result.setReason("关键词为空");
			result.setResult(false);
			return result;
		}

		word = "%" + word + "%";
		logger.info("======进入了MedicineController的/search方法，参数：search_type = " + search_type + " word = " + word);

		List<Medicine> all = new ArrayList<>();
		List<Medicine> searchGenericName = null;
		List<Medicine> searchBrand = null;
		List<Medicine> searchMajorFunctions = null;
		List<Medicine> searchManufacturingEnterprise = null;
		switch (search_type) {
		case 0:
			// 名称
			searchGenericName = medicineService.searchGenericName(word);
			ListUtil.add2List(all, searchGenericName);
			break;
		case 1:
			// 主治功能
			searchMajorFunctions = medicineService.searchMajorFunctions(word);
			ListUtil.add2List(all, searchMajorFunctions);
			break;
		case 2:
			// 品牌
			searchBrand = medicineService.searchBrand(word);
			ListUtil.add2List(all, searchBrand);
			break;
		case 3:
			// 生产厂家
			searchManufacturingEnterprise = medicineService.searchManufacturingEnterprise(word);
			ListUtil.add2List(all, searchManufacturingEnterprise);
			break;
		case 4:
			// 全部
			searchGenericName = medicineService.searchGenericName(word);
			searchBrand = medicineService.searchBrand(word);
			searchMajorFunctions = medicineService.searchMajorFunctions(word);
			searchManufacturingEnterprise = medicineService.searchManufacturingEnterprise(word);
			ListUtil.add2List(all, searchGenericName);
			ListUtil.add2List(all, searchBrand);
			ListUtil.add2List(all, searchMajorFunctions);
			ListUtil.add2List(all, searchManufacturingEnterprise);
			break;
		default:
			break;
		}
		result.setResult(true);
		result.setDatum(all);
		return result;

	}

	// 查询指定ID对应药品详情
	@RequestMapping(value = "/map/", method = RequestMethod.POST)
	public @ResponseBody ReturnModel map(String id, Integer map_op, HttpServletResponse response,
			HttpServletRequest request) {
		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");
		ReturnModel result = new ReturnModel();
		result.setResult(true);

		Medicine medicine = medicineService.searchById(id);

		if (medicine != null) {
			MapModel mapModel = new MapModel();
			List<MapNode> nodes = new ArrayList<>();
			List<MapEdge> edges = new ArrayList<>();

			MapNode mapNode = new MapNode();
			mapNode.setName(medicine.getDrugName());
			nodes.add(mapNode);

			switch (map_op) {
			case 0:
				// 获取制药企业
				List<MedicineCompany> proCompanys = companyService.getMapDatas(medicine, Constant.RELATION_PRO);
				for (MedicineCompany company : proCompanys) {
					MapNode node = new MapNode();
					node.setName(company.getCompanyName());
					nodes.add(node);

					MapEdge mapEdge = new MapEdge();
					mapEdge.setSource(medicine.getDrugName());
					mapEdge.setTarget(company.getCompanyName());
					mapEdge.setRelation(Constant.RELATION_PRO);
					edges.add(mapEdge);
				}
				// 获取卖药企业
				List<MedicineCompany> saleCompanys = companyService.getMapDatas(medicine, Constant.RELATION_SALE);
				for (MedicineCompany company : saleCompanys) {
					MapNode node = new MapNode();
					node.setName(company.getCompanyName());
					nodes.add(node);

					MapEdge mapEdge = new MapEdge();
					mapEdge.setSource(medicine.getDrugName());
					mapEdge.setTarget(company.getCompanyName());
					mapEdge.setRelation(Constant.RELATION_SALE);
					edges.add(mapEdge);
				}
				break;
			case 1:
				String drugType3 = medicine.getDrugType3();
				List<Medicine> medicines = medicineService.searchByDrugType3(drugType3);
				logger.info("medicines.size() " + medicines.size());
				for (Medicine m : medicines) {
					MapNode node = new MapNode();
					node.setName(m.getDrugName());
					nodes.add(node);

					MapEdge mapEdge = new MapEdge();
					mapEdge.setSource(medicine.getDrugName());
					mapEdge.setTarget(m.getDrugName());
					mapEdge.setRelation(drugType3);
					edges.add(mapEdge);
				}
				break;
			}
			mapModel.setNodes(nodes);
			mapModel.setEdges(edges);
			result.setDatum(mapModel);
		} else {
			result.setReason(Constant.REASON_UNKNOW);
			result.setResult(false);
		}

		return result;
	}
}

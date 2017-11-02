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
@RequestMapping("company")
public class CompanyController {

	private static final Logger logger = Logger.getInstance();
	@Autowired
	CompanyService companyService;
	@Autowired
	private MedicineService medicineService;

	
	// 查询指定ID对应药品详情
		@RequestMapping(value = "/getHot/", method = RequestMethod.POST)
		public @ResponseBody ReturnModel getHot(HttpServletResponse response, HttpServletRequest request) {
			logger.info("======进入了CompanyController的/getHot" );
			// 解决Ajax跨域请求问题
			response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
			response.setHeader("Access-Control-Allow-Credentials", "true");

			ReturnModel result = new ReturnModel();

			List<MedicineCompany> medicineCompanys = companyService.getHotCompanys();
			result.setDatum(medicineCompanys);
			result.setResult(true);
			return result;
		}
	
	
	@RequestMapping(value = "/detail/", method = RequestMethod.POST)
	public @ResponseBody ReturnModel detail(String id, HttpServletResponse response, HttpServletRequest request) {

		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");

		ReturnModel result = new ReturnModel();

		MedicineCompany company = companyService.searchById(id);
		result.setDatum(company);
		result.setResult(true);
		return result;
	}

	@RequestMapping(value = "/getIdByName/", method = RequestMethod.POST)
	public @ResponseBody ReturnModel getIdByName(String name, HttpServletResponse response,
			HttpServletRequest request) {

		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");

		ReturnModel result = new ReturnModel();

		String id = companyService.getCompanyByName(name) == null ? "8a7088cf-abe9-11e7-9127-3c970efacc3f"
				: companyService.getCompanyByName(name).getId();
		result.setDatum(id);
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
		logger.info("======进入了CompanyController的/search方法，参数：search_type = " + search_type + " word = " + word);

		List<MedicineCompany> all = new ArrayList<>();
		List<MedicineCompany> searchGenericName = null;
		List<MedicineCompany> searchCompanyProvince = null;
		List<MedicineCompany> searchCompanyRange = null;
		switch (search_type) {
		case 5:
			// 名称
			searchGenericName = companyService.searchCompanyName(word);
			ListUtil.add2List(all, searchGenericName);
			break;
		case 6:
			// 主治功能
			searchCompanyProvince = companyService.searchCompanyProvince(word);
			ListUtil.add2List(all, searchCompanyProvince);
			break;
		case 7:
			// 品牌
			searchCompanyRange = companyService.searchCompanyRange(word);
			ListUtil.add2List(all, searchCompanyRange);
			break;
		case 8:
			// 全部
			searchGenericName = companyService.searchCompanyName(word);
			searchCompanyProvince = companyService.searchCompanyProvince(word);
			searchCompanyRange = companyService.searchCompanyRange(word);
			ListUtil.add2List(all, searchGenericName);
			ListUtil.add2List(all, searchCompanyProvince);
			ListUtil.add2List(all, searchCompanyRange);
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
		logger.info("======进入了CompanyController的/map方法，参数：id = " + id + " map_op = " + map_op);

		MedicineCompany company = companyService.searchById(id);

		if (company != null) {
			MapModel mapModel = new MapModel();
			List<MapNode> nodes = new ArrayList<>();
			List<MapEdge> edges = new ArrayList<>();

			MapNode mapNode = new MapNode();
			mapNode.setName(company.getCompanyName());
			nodes.add(mapNode);

			switch (map_op) {
			case 0:
				// 获取制药企业
				List<Medicine> proMedicines = medicineService.getMapDatas(company, Constant.RELATION_PRO);
				for (Medicine medicine : proMedicines) {
					MapNode node = new MapNode();
					node.setName(medicine.getDrugName());
					nodes.add(node);

					MapEdge mapEdge = new MapEdge();
					mapEdge.setTarget(medicine.getDrugName());
					mapEdge.setSource(company.getCompanyName());
					mapEdge.setRelation(Constant.RELATION_PRO);
					edges.add(mapEdge);
				}
				// 获取卖药企业
				List<Medicine> saleMedicines = medicineService.getMapDatas(company, Constant.RELATION_SALE);
				logger.info("saleMedicines.size() " + saleMedicines.size());
				if (saleMedicines.size() > 0) {
					for (Medicine medicine : saleMedicines) {
						MapNode node = new MapNode();
						if (medicine != null) {
							logger.info("medicine.toString() " + medicine.toString());
							node.setName(medicine.getDrugName() == null ? "" : medicine.getDrugName());
							nodes.add(node);

							MapEdge mapEdge = new MapEdge();
							mapEdge.setTarget(medicine.getDrugName());
							mapEdge.setSource(company.getCompanyName());
							mapEdge.setRelation(Constant.RELATION_SALE);
							edges.add(mapEdge);
						}

					}
				}

				break;
			case 1:
				String productionAddress = company.getProductionAddress();
				String province = company.getProvincesCities();
				List<MedicineCompany> companys = companyService.searchByProductionAddress(productionAddress, province);
				logger.info("companys.size() " + companys.size());
				createRelation(company, nodes, edges, "相同地区", companys);
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

	private void createRelation(MedicineCompany source, List<MapNode> nodes, List<MapEdge> edges, String relationship,
			List<MedicineCompany> targets) {
		for (MedicineCompany m : targets) {
			MapNode node = new MapNode();
			node.setName(m.getCompanyName());
			nodes.add(node);
			MapEdge mapEdge = new MapEdge();
			mapEdge.setSource(source.getCompanyName());
			mapEdge.setTarget(m.getCompanyName());
			mapEdge.setRelation(relationship);
			edges.add(mapEdge);
		}
	}

}

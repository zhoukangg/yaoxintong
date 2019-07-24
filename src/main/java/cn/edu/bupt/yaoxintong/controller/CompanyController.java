package cn.edu.bupt.yaoxintong.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
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
			switch (map_op) {
			case 0:
			    // 把自己（中心节点）添加进来
				MapNode mapNode = new MapNode();
				mapNode.setName(company.getCompanyName());
				nodes.add(mapNode);
				// 获取制药企业
				List<Medicine> proMedicines = medicineService.getMapDatas(company, Constant.RELATION_PRO);
				for (Medicine medicine : proMedicines) {
					MapNode node = new MapNode();
					node.setName(medicine.getDrugName());
					nodes.add(node);

					MapEdge mapEdge = new MapEdge();
					mapEdge.setTarget(0);
					mapEdge.setSource(nodes.indexOf(node));
					mapEdge.setRelation(Constant.RELATION_PRO);
					edges.add(mapEdge);
				}
				// 获取卖药企业
				List<Medicine> saleMedicines = medicineService.getMapDatas(company, Constant.RELATION_SALE);
				logger.info("saleMedicines.size() " + saleMedicines.size());
				if (saleMedicines.size() > 0) {
					for (Medicine medicine : saleMedicines) {
						if (medicine != null) {
                            MapNode node = new MapNode();
							node.setName(medicine.getDrugName() == null ? "" : medicine.getDrugName());
							nodes.add(node);

							MapEdge mapEdge = new MapEdge();
							mapEdge.setTarget(0);
							mapEdge.setSource(nodes.indexOf(node));
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

	private void createRelation(MedicineCompany source, List<MapNode> nodes, List<MapEdge> edges, String relationship, List<MedicineCompany> targets) {
        // 把自己（中心节点）添加进来
        MapNode mapNode = new MapNode();
        mapNode.setName(source.getCompanyName());
        nodes.add(mapNode);

        for (MedicineCompany m : targets) {
			MapNode node = new MapNode();
			node.setName(m.getCompanyName());
			nodes.add(node);

			MapEdge mapEdge = new MapEdge();
			mapEdge.setSource(0);
			mapEdge.setTarget(nodes.indexOf(node));
			mapEdge.setRelation(relationship);
			edges.add(mapEdge);
		}
	}


	// 查询指定ID对应药企业报告
	@RequestMapping(value = "/report/", method = RequestMethod.POST)
	public @ResponseBody ReturnModel report(String id, HttpServletResponse response, HttpServletRequest request) {
		logger.info("======进入了CompanyController的/report");
		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");

		ReturnModel result = new ReturnModel();
		MedicineCompany company = companyService.searchById(id);

		// Create Document Instance
		Document document = new Document();
		// add Chinese font
		try {
			BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
			Font headfont = new Font(bfChinese, 20, Font.BOLD);
			// headfont.setColor(0,0,255);
			Font keyfont = new Font(bfChinese, 14, Font.BOLD);
			Font textfont = new Font(bfChinese, 14, Font.NORMAL);

			String path = request.getServletContext().getRealPath("/pdf/");
			PdfWriter.getInstance(document, new FileOutputStream(new File(path+id+".pdf")));

			document.open();
			// 标题
			document.addTitle("药信通数据报告");
			// 作者
			document.addAuthor("药信通");
			// 主题
			document.addSubject("this is subject");
			// 关键字
			document.addKeywords("Keywords");
			// 创建时间
			document.addCreationDate();

			// document.setMargins(30, 20, 20, 20);
			PdfPTable table = new PdfPTable(2);

			table.setPaddingTop(3);// 顶部空白区高度
			// table.setTotalWidth(360);//表格整体宽度
			table.setWidthPercentage(100); // 宽度100%填充
			table.setSpacingBefore(20f); // 前间距
			table.setSpacingAfter(20f); // 后间距

			List<PdfPRow> listRow = table.getRows();
			// 设置列宽
			float[] columnWidths = { 1f, 2f };
			table.setWidths(columnWidths);

			PdfPCell cell = new PdfPCell(new Paragraph("药企基本信息", headfont));
			cell.setColspan(2);// 占据八列
			cell.setRowspan(2);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			cell.setPadding(5.0f);
			table.addCell(cell);

            table.addCell(new Paragraph("编号", keyfont));
            table.addCell(new Paragraph(company.getNumber(), textfont));
            table.addCell(new Paragraph("社会信用代码/组织机构代码", keyfont));
            table.addCell(new Paragraph(company.getCreditOrganizationCode(), textfont));
            table.addCell(new Paragraph("分类码", keyfont));
            table.addCell(new Paragraph(company.getClassificationCode(), textfont));
            table.addCell(new Paragraph("省市", keyfont));
            table.addCell(new Paragraph(company.getProvincesCities(), textfont));
            table.addCell(new Paragraph("企业名称", keyfont));
            table.addCell(new Paragraph(company.getCompanyName(), textfont));
            table.addCell(new Paragraph("法定代表人", keyfont));
            table.addCell(new Paragraph(company.getLegalRepresentative(), textfont));
            table.addCell(new Paragraph("企业负责人", keyfont));
            table.addCell(new Paragraph(company.getResponsiblePerson(), textfont));
            table.addCell(new Paragraph("质量负责人", keyfont));
            table.addCell(new Paragraph(company.getQualityOfficer(), textfont));
            table.addCell(new Paragraph("注册地址", keyfont));
            table.addCell(new Paragraph(company.getRegisteredAddress(), textfont));
            table.addCell(new Paragraph("生产地址", keyfont));
            table.addCell(new Paragraph(company.getProductionAddress(), textfont));
            table.addCell(new Paragraph("生产范围", keyfont));
            table.addCell(new Paragraph(company.getProductionRange(), textfont));
            table.addCell(new Paragraph("发证日期", keyfont));
            table.addCell(new Paragraph(company.getIssueDate(), textfont));
            table.addCell(new Paragraph("有效期至", keyfont));
            table.addCell(new Paragraph(company.getEffectiveDeadline(), textfont));
            table.addCell(new Paragraph("发证机关", keyfont));
            table.addCell(new Paragraph(company.getIssuingAuthority(), textfont));
            table.addCell(new Paragraph("签发人", keyfont));
            table.addCell(new Paragraph(company.getIssuer(), textfont));
            table.addCell(new Paragraph("日常监管机构", keyfont));
            table.addCell(new Paragraph(company.getRegulator(), textfont));
            table.addCell(new Paragraph("日常监管人员", keyfont));
            table.addCell(new Paragraph(company.getSupervisor(), textfont));
			document.add(table);
			document.close();

			logger.info("药企报告下载到本地");
			result.setDatum("/pdf/"+id+".pdf");
			result.setResult(true);
		} catch (DocumentException | IOException e) {
			// TODO Auto-generated catch block
			logger.info("导出失败");
			e.printStackTrace();
		}
		return result;
	}

}

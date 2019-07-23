package cn.edu.bupt.yaoxintong.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPRow;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import cn.edu.bupt.yaoxintong.pojo.Medicine;
import cn.edu.bupt.yaoxintong.pojo.MedicineCompany;
import cn.edu.bupt.yaoxintong.response.model.MapEdge;
import cn.edu.bupt.yaoxintong.response.model.MapModel;
import cn.edu.bupt.yaoxintong.response.model.MapNode;
import cn.edu.bupt.yaoxintong.service.CompanyService;
import cn.edu.bupt.yaoxintong.service.MedicineService;
import cn.edu.bupt.yaoxintong.util.Constant;
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
		logger.info("======进入了MedicineController的/report");
		// 解决Ajax跨域请求问题
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");

		ReturnModel result = new ReturnModel();
		// 药品详细信息
		Medicine medicine = medicineService.searchById(id);
		// 获取制药企业
		List<MedicineCompany> proCompanys = companyService.getMapDatas(medicine, Constant.RELATION_PRO);
		// 获取卖药企业
		List<MedicineCompany> saleCompanys = companyService.getMapDatas(medicine, Constant.RELATION_SALE);
		String drugType3 = medicine.getDrugType3();
		List<Medicine> medicines = medicineService.searchByDrugType3(drugType3);

		// Create Document Instance
		Document document = new Document();

		// add Chinese font
		try {
			BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
			Font headfont = new Font(bfChinese, 20, Font.BOLD);
			// headfont.setColor(0,0,255);
			Font keyfont = new Font(bfChinese, 14, Font.BOLD);
			Font textfont = new Font(bfChinese, 14, Font.NORMAL);

			PdfWriter.getInstance(document, new FileOutputStream(new File("F:\\POReceiveReport.pdf")));

			document.open();
			// 标题
			document.addTitle("this is a title");
			// 作者
			document.addAuthor("kang");
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

			PdfPCell cell = new PdfPCell(new Paragraph("药品基本信息", headfont));
			cell.setColspan(2);// 占据八列
			cell.setRowspan(2);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			cell.setPadding(5.0f);
			table.addCell(cell);

			table.addCell(new Paragraph("批准文号", keyfont));
			table.addCell(new Paragraph(medicine.getLicenseNumber(), textfont));
			table.addCell(new Paragraph("产品名称", keyfont));
			table.addCell(new Paragraph(medicine.getDrugName(), textfont));
			table.addCell(new Paragraph("品牌", keyfont));
			table.addCell(new Paragraph(medicine.getBrand(), textfont));
			table.addCell(new Paragraph("剂型", keyfont));
			table.addCell(new Paragraph(medicine.getDrugForm(), textfont));
			table.addCell(new Paragraph("规格", keyfont));
			table.addCell(new Paragraph(medicine.getProductWeight(), textfont));
			table.addCell(new Paragraph("类别", keyfont));
			table.addCell(new Paragraph(
					medicine.getDrugType1() + " " + medicine.getDrugType2() + " " + medicine.getDrugType3(), textfont));
			table.addCell(new Paragraph("主治功能", keyfont));
			table.addCell(new Paragraph(medicine.getUseForIllness(), textfont));
			table.addCell(new Paragraph("使用方法", keyfont));
			table.addCell(new Paragraph(medicine.getDosageUse(), textfont));
			table.addCell(new Paragraph("生产单位", keyfont));
			table.addCell(new Paragraph(medicine.getManufacturer(), textfont));
			table.addCell(new Paragraph("生产地址", keyfont));
			table.addCell(new Paragraph(medicine.getProductPlace(), textfont));
			document.add(table);

			PdfPTable table2 = new PdfPTable(2);

			table2.setPaddingTop(3);// 顶部空白区高度
			// table.setTotalWidth(360);//表格整体宽度
			table2.setWidthPercentage(100); // 宽度100%填充
			table2.setSpacingBefore(20f); // 前间距
			table2.setSpacingAfter(20f); // 后间距

			List<PdfPRow> listRow2 = table.getRows();
			// 设置列宽
			float[] columnWidths2 = { 1f, 2f };
			table.setWidths(columnWidths2);

			PdfPCell cell2 = new PdfPCell(new Paragraph("生产药品企业基本信息", headfont));
			cell2.setColspan(2);// 占据八列
			cell2.setRowspan(2);
			cell2.setPadding(5.0f);
			cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell2.setVerticalAlignment(Element.ALIGN_CENTER);
			table2.addCell(cell2);
			for (MedicineCompany company : proCompanys) {
				table2.addCell(new Paragraph("编号", keyfont));
				table2.addCell(new Paragraph(company.getNumber(), textfont));
				table2.addCell(new Paragraph("社会信用代码/组织机构代码", keyfont));
				table2.addCell(new Paragraph(company.getCreditOrganizationCode(), textfont));
				table2.addCell(new Paragraph("分类码", keyfont));
				table2.addCell(new Paragraph(company.getClassificationCode(), textfont));
				table2.addCell(new Paragraph("省市", keyfont));
				table2.addCell(new Paragraph(company.getProvincesCities(), textfont));
				table2.addCell(new Paragraph("企业名称", keyfont));
				table2.addCell(new Paragraph(company.getCompanyName(), textfont));
				table2.addCell(new Paragraph("法定代表人", keyfont));
				table2.addCell(new Paragraph(company.getLegalRepresentative(), textfont));
				table2.addCell(new Paragraph("企业负责人", keyfont));
				table2.addCell(new Paragraph(company.getResponsiblePerson(), textfont));
				table2.addCell(new Paragraph("质量负责人", keyfont));
				table2.addCell(new Paragraph(company.getQualityOfficer(), textfont));
				table2.addCell(new Paragraph("注册地址", keyfont));
				table2.addCell(new Paragraph(company.getRegisteredAddress(), textfont));
				table2.addCell(new Paragraph("生产地址", keyfont));
				table2.addCell(new Paragraph(company.getProductionAddress(), textfont));
				table2.addCell(new Paragraph("生产范围", keyfont));
				table2.addCell(new Paragraph(company.getProductionRange(), textfont));
				table2.addCell(new Paragraph("发证日期", keyfont));
				table2.addCell(new Paragraph(company.getIssueDate(), textfont));
				table2.addCell(new Paragraph("有效期至", keyfont));
				table2.addCell(new Paragraph(company.getEffectiveDeadline(), textfont));
				table2.addCell(new Paragraph("发证机关", keyfont));
				table2.addCell(new Paragraph(company.getIssuingAuthority(), textfont));
				table2.addCell(new Paragraph("签发人", keyfont));
				table2.addCell(new Paragraph(company.getIssuer(), textfont));
				table2.addCell(new Paragraph("日常监管机构", keyfont));
				table2.addCell(new Paragraph(company.getRegulator(), textfont));
				table2.addCell(new Paragraph("日常监管人员", keyfont));
				table2.addCell(new Paragraph(company.getSupervisor(), textfont));
				table2.addCell(new Paragraph(""));
			}
			document.add(table2);
			logger.info(proCompanys.toString());

			document.close();
			logger.info("报告下载到本地");
			// 发送邮件
		} catch (DocumentException | IOException e) {
			// TODO Auto-generated catch block
			logger.info("导出失败");
			e.printStackTrace();
		}

		return result;
	}

	// 获取热销商品
	@RequestMapping(value = "/getHot/", method = RequestMethod.POST)
	public @ResponseBody ReturnModel getHot(HttpServletResponse response, HttpServletRequest request) {
		logger.info("======进入了MedicineController getHot()");
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
		logger.info("======进入了MedicineController的/detail方法，参数：id = " + id);

		ReturnModel result = new ReturnModel();

		try {
			Medicine medicine = medicineService.searchById(id);
			result.setDatum(medicine);
			result.setResult(true);
		}catch (Exception e){
			e.printStackTrace();
		}
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

		logger.info("======进入了MedicineController的/search方法，参数：search_type = " + search_type + " word = " + word);
		
		
		List<Medicine> all = medicineService.search(word,search_type);
		
/*
		List<Medicine> searchGenericName = null;
		List<Medicine> searchBrand = null;
		List<Medicine> searchMajorFunctions = null;
		List<Medicine> searchManufacturingEnterprise = null;
		switch (search_type) {
		case 0:
			// 名称
			for(Term term : terms) {
				searchGenericName = medicineService.searchGenericName(term.getName());
				System.out.println("term.getName()--->"+term.getName());
				ListUtil.add2List(all, searchGenericName);
			}
			break;
		case 1:
			// 主治功能
			for(Term term : terms) {
				searchGenericName = medicineService.searchMajorFunctions(term.getName());
				System.out.println("term.getName()--->"+term.getName());
				ListUtil.add2List(all, searchGenericName);
			}
			break;
		case 2:
			// 品牌
			for(Term term : terms) {
				searchGenericName = medicineService.searchBrand(term.getName());
				System.out.println("term.getName()--->"+term.getName());
				ListUtil.add2List(all, searchGenericName);
			}
			break;
		case 3:
			// 生产厂家
			for(Term term : terms) {
				searchGenericName = medicineService.searchManufacturingEnterprise(term.getName());
				System.out.println("term.getName()--->"+term.getName());
				ListUtil.add2List(all, searchGenericName);
			}
			break;
		case 4:
			// 全部
			for(Term term : terms) {
				System.out.println("term.getName()--->"+term.getName());
				searchGenericName = medicineService.searchGenericName(term.getName());
				searchBrand = medicineService.searchBrand(term.getName());
				searchMajorFunctions = medicineService.searchMajorFunctions(term.getName());
				searchManufacturingEnterprise = medicineService.searchManufacturingEnterprise(term.getName());
				ListUtil.add2List(all, searchGenericName);
				ListUtil.add2List(all, searchBrand);
				ListUtil.add2List(all, searchMajorFunctions);
				ListUtil.add2List(all, searchManufacturingEnterprise);
			}
			break;
		default:
			break;
		}
*/
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

			switch (map_op) {
			case 0:
				// 获取制药企业
				mapNode.setName(medicine.getDrugName());
				nodes.add(mapNode);
				List<MedicineCompany> proCompanys = companyService.getMapDatas(medicine, Constant.RELATION_PRO);
				int i = 0;
				for (MedicineCompany company : proCompanys) {
					++i;
					MapNode node = new MapNode();
					node.setName(company.getCompanyName());
					nodes.add(node);

					MapEdge mapEdge = new MapEdge();
					mapEdge.setSource(0);
					mapEdge.setTarget(i);
					mapEdge.setRelation(Constant.RELATION_PRO);
					edges.add(mapEdge);
				}
				// 获取卖药企业
				List<MedicineCompany> saleCompanys = companyService.getMapDatas(medicine, Constant.RELATION_SALE);
				int j = 0;
				for (MedicineCompany company : saleCompanys) {
					++j;
					MapNode node = new MapNode();
					node.setName(company.getCompanyName());
					nodes.add(node);

					MapEdge mapEdge = new MapEdge();
					mapEdge.setSource(0);
					mapEdge.setTarget(j);
					mapEdge.setRelation(Constant.RELATION_SALE);
					edges.add(mapEdge);
				}
				break;
			case 1:
				String drugType3 = medicine.getDrugType3();
				List<Medicine> medicines = medicineService.searchByDrugType3(drugType3);
				List<String> names = new ArrayList<>();
				logger.info("medicines.size() " + medicines.size());
				for (Medicine m : medicines) {
					if (!names.contains(m.getDrugName())) {
						names.add(m.getDrugName());
						MapNode node = new MapNode();
						node.setName(m.getDrugName());
						nodes.add(node);

						MapEdge mapEdge = new MapEdge();
						mapEdge.setSource(0);
						mapEdge.setTarget(medicines.indexOf(m) );
						mapEdge.setRelation(drugType3);
						edges.add(mapEdge);
					}
				}
				logger.info("names.size() " + names.size());
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

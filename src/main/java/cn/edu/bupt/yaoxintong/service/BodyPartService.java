package cn.edu.bupt.yaoxintong.service;

import java.util.List;

import cn.edu.bupt.yaoxintong.pojo.custom.BodyPart;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月31日 下午9:59:08
* 
* 类说明 
*/
public interface BodyPartService {
	List<BodyPart> getBodyParts();
	List<BodyPart> getBodyPartsByPart(String part);
}

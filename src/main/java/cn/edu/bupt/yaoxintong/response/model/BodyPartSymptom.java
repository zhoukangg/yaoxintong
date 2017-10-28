package cn.edu.bupt.yaoxintong.response.model;

import java.util.List;

import cn.edu.bupt.yaoxintong.pojo.custom.BodyPart;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月31日 下午10:16:45
* 
* 类说明 
*/
public class BodyPartSymptom {
	private String part;
	private List<BodyPart> bodyParts;
	/**
	 * @return the part
	 */
	public String getPart() {
		return part;
	}
	/**
	 * @param part the part to set
	 */
	public void setPart(String part) {
		this.part = part;
	}
	/**
	 * @return the bodyParts
	 */
	public List<BodyPart> getBodyParts() {
		return bodyParts;
	}
	/**
	 * @param bodyParts the bodyParts to set
	 */
	public void setBodyParts(List<BodyPart> bodyParts) {
		this.bodyParts = bodyParts;
	}
}

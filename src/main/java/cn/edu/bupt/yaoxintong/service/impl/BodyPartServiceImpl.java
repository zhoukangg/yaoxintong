package cn.edu.bupt.yaoxintong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.custom.BodyPartMapper;
import cn.edu.bupt.yaoxintong.pojo.custom.BodyPart;
import cn.edu.bupt.yaoxintong.pojo.custom.BodyPartExample;
import cn.edu.bupt.yaoxintong.service.BodyPartService;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月31日 下午10:10:17
* 
* 类说明 
*/
@Service
public class BodyPartServiceImpl implements BodyPartService {
	@Autowired BodyPartMapper bodyPartMapper;
	@Override
	public List<BodyPart> getBodyParts() {
		// TODO Auto-generated method stub @author 作者wydewy
		BodyPartExample example = new BodyPartExample();
		example.setGroupByClause("part");
		return bodyPartMapper.selectByExample(example);
	}
	@Override
	public List<BodyPart> getBodyPartsByPart(String part) {
		// TODO Auto-generated method stub @author 作者wydewy
		BodyPartExample example = new BodyPartExample();
		example.createCriteria().andPartEqualTo(part);
		return bodyPartMapper.selectByExample(example);
	}

}

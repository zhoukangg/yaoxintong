package cn.edu.bupt.yaoxintong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.PictureMapper;
import cn.edu.bupt.yaoxintong.pojo.Picture;
import cn.edu.bupt.yaoxintong.service.PictureService;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月31日 下午8:55:16
* 
* 类说明 
*/
@Service
public class PictureServiceImpl implements PictureService {

	@Autowired PictureMapper pictureMapper;
	
	@Override
	public Picture getPictureById(Integer pictureId) {
		// TODO Auto-generated method stub @author 作者wydewy
		return pictureMapper.selectByPrimaryKey(pictureId);
	}

}

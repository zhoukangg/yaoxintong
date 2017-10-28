package cn.edu.bupt.yaoxintong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.custom.FloorMapper;
import cn.edu.bupt.yaoxintong.pojo.custom.Floor;
import cn.edu.bupt.yaoxintong.pojo.custom.FloorExample;
import cn.edu.bupt.yaoxintong.service.FloorService;

/** 
* @author 作者wydewy
* @version 创建时间：2017年7月28日 下午4:18:56
* 
* 类说明 
*/
@Service
public class FloorServiceImpl implements FloorService {

	
	@Autowired FloorMapper floorMapper;
	@Override
	public int addFloor(Floor floor) {
		// TODO Auto-generated method stub @author 作者wydewy
		int i = floorMapper.insert(floor);
		return i;
	}

	@Override
	public int deleteFloor(Integer id) {
		// TODO Auto-generated method stub @author 作者wydewy
		int i = floorMapper.deleteByPrimaryKey(id);
		return i;
	}

	@Override
	public int updateFloor(Floor floor) {
		// TODO Auto-generated method stub @author 作者wydewy
		int i = floorMapper.updateByPrimaryKey(floor);
		return i;
	}

	@Override
	public List<Floor> getFloor(Integer floor) {
		FloorExample example = new FloorExample();
		example.createCriteria().andFloorEqualTo(floor);
		return floorMapper.selectByExample(example);
	}

	@Override
	public List<Floor> getFloorMedicineClass(int start,int end) {
		FloorExample example = new FloorExample();
		example.createCriteria().andFloorGreaterThan(start).andFloorLessThan(end);
		example.setGroupByClause("name");
		return floorMapper.selectByExample(example);
	}

	@Override
	public List<Floor> getFloorMedicineClassByName(Integer floor) {
		// TODO Auto-generated method stub @author 作者wydewy
		FloorExample example = new FloorExample();
		example.createCriteria().andFloorEqualTo(floor);
		return floorMapper.selectByExample(example);
	}

}

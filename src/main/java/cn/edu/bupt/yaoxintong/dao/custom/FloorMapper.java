package cn.edu.bupt.yaoxintong.dao.custom;

import cn.edu.bupt.yaoxintong.pojo.custom.Floor;
import cn.edu.bupt.yaoxintong.pojo.custom.FloorExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FloorMapper {
    int countByExample(FloorExample example);

    int deleteByExample(FloorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Floor record);

    int insertSelective(Floor record);

    List<Floor> selectByExample(FloorExample example);

    Floor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Floor record, @Param("example") FloorExample example);

    int updateByExample(@Param("record") Floor record, @Param("example") FloorExample example);

    int updateByPrimaryKeySelective(Floor record);

    int updateByPrimaryKey(Floor record);
}
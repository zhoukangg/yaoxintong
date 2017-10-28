package cn.edu.bupt.yaoxintong.dao.custom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.bupt.yaoxintong.pojo.custom.FloorMedicine;
import cn.edu.bupt.yaoxintong.pojo.custom.FloorMedicineExample;

public interface FloorMedicineMapper {
    int countByExample(FloorMedicineExample example);

    int deleteByExample(FloorMedicineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FloorMedicine record);

    int insertSelective(FloorMedicine record);

    List<FloorMedicine> selectByExample(FloorMedicineExample example);

    FloorMedicine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FloorMedicine record, @Param("example") FloorMedicineExample example);

    int updateByExample(@Param("record") FloorMedicine record, @Param("example") FloorMedicineExample example);

    int updateByPrimaryKeySelective(FloorMedicine record);

    int updateByPrimaryKey(FloorMedicine record);
}
package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.MedicineSimple;
import cn.edu.bupt.yaoxintong.pojo.MedicineSimpleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicineSimpleMapper {
    int countByExample(MedicineSimpleExample example);

    int deleteByExample(MedicineSimpleExample example);

    int insert(MedicineSimple record);

    int insertSelective(MedicineSimple record);

    List<MedicineSimple> selectByExample(MedicineSimpleExample example);

    int updateByExampleSelective(@Param("record") MedicineSimple record, @Param("example") MedicineSimpleExample example);

    int updateByExample(@Param("record") MedicineSimple record, @Param("example") MedicineSimpleExample example);
}
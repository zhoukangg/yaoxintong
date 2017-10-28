package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.MedicineClass;
import cn.edu.bupt.yaoxintong.pojo.MedicineClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicineClassMapper {
    int countByExample(MedicineClassExample example);

    int deleteByExample(MedicineClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicineClass record);

    int insertSelective(MedicineClass record);

    List<MedicineClass> selectByExample(MedicineClassExample example);

    MedicineClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicineClass record, @Param("example") MedicineClassExample example);

    int updateByExample(@Param("record") MedicineClass record, @Param("example") MedicineClassExample example);

    int updateByPrimaryKeySelective(MedicineClass record);

    int updateByPrimaryKey(MedicineClass record);
}
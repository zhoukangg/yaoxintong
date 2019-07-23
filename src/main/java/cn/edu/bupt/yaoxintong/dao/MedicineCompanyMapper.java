package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.MedicineCompany;
import cn.edu.bupt.yaoxintong.pojo.MedicineCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicineCompanyMapper {
    int countByExample(MedicineCompanyExample example);

    int deleteByExample(MedicineCompanyExample example);

    int deleteByPrimaryKey(String id);

    int insert(MedicineCompany record);

    int insertSelective(MedicineCompany record);

    List<MedicineCompany> selectByExample(MedicineCompanyExample example);

    MedicineCompany selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MedicineCompany record, @Param("example") MedicineCompanyExample example);

    int updateByExample(@Param("record") MedicineCompany record, @Param("example") MedicineCompanyExample example);

    int updateByPrimaryKeySelective(MedicineCompany record);

    int updateByPrimaryKey(MedicineCompany record);
}
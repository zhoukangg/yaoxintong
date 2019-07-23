package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.ContactInformation;
import cn.edu.bupt.yaoxintong.pojo.ContactInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactInformationMapper {
    int countByExample(ContactInformationExample example);

    int deleteByExample(ContactInformationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContactInformation record);

    int insertSelective(ContactInformation record);

    List<ContactInformation> selectByExample(ContactInformationExample example);

    ContactInformation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContactInformation record, @Param("example") ContactInformationExample example);

    int updateByExample(@Param("record") ContactInformation record, @Param("example") ContactInformationExample example);

    int updateByPrimaryKeySelective(ContactInformation record);

    int updateByPrimaryKey(ContactInformation record);
}
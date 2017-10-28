package cn.edu.bupt.yaoxintong.dao.custom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.bupt.yaoxintong.pojo.custom.BodyPart;
import cn.edu.bupt.yaoxintong.pojo.custom.BodyPartExample;

public interface BodyPartMapper {
    int countByExample(BodyPartExample example);

    int deleteByExample(BodyPartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BodyPart record);

    int insertSelective(BodyPart record);

    List<BodyPart> selectByExample(BodyPartExample example);

    BodyPart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BodyPart record, @Param("example") BodyPartExample example);

    int updateByExample(@Param("record") BodyPart record, @Param("example") BodyPartExample example);

    int updateByPrimaryKeySelective(BodyPart record);

    int updateByPrimaryKey(BodyPart record);
}
package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.FloatAd;
import cn.edu.bupt.yaoxintong.pojo.FloatAdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FloatAdMapper {
    int countByExample(FloatAdExample example);

    int deleteByExample(FloatAdExample example);

    int deleteByPrimaryKey(String id);

    int insert(FloatAd record);

    int insertSelective(FloatAd record);

    List<FloatAd> selectByExample(FloatAdExample example);

    FloatAd selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FloatAd record, @Param("example") FloatAdExample example);

    int updateByExample(@Param("record") FloatAd record, @Param("example") FloatAdExample example);

    int updateByPrimaryKeySelective(FloatAd record);

    int updateByPrimaryKey(FloatAd record);
}
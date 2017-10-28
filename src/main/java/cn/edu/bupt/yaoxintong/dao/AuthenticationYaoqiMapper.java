package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.AuthenticationYaoqi;
import cn.edu.bupt.yaoxintong.pojo.AuthenticationYaoqiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthenticationYaoqiMapper {
    int countByExample(AuthenticationYaoqiExample example);

    int deleteByExample(AuthenticationYaoqiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthenticationYaoqi record);

    int insertSelective(AuthenticationYaoqi record);

    List<AuthenticationYaoqi> selectByExample(AuthenticationYaoqiExample example);

    AuthenticationYaoqi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthenticationYaoqi record, @Param("example") AuthenticationYaoqiExample example);

    int updateByExample(@Param("record") AuthenticationYaoqi record, @Param("example") AuthenticationYaoqiExample example);

    int updateByPrimaryKeySelective(AuthenticationYaoqi record);

    int updateByPrimaryKey(AuthenticationYaoqi record);
}
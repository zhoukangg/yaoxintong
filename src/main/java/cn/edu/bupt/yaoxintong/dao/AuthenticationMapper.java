package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.Authentication;
import cn.edu.bupt.yaoxintong.pojo.AuthenticationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthenticationMapper {
    int countByExample(AuthenticationExample example);

    int deleteByExample(AuthenticationExample example);

    int insert(Authentication record);

    int insertSelective(Authentication record);

    List<Authentication> selectByExample(AuthenticationExample example);

    int updateByExampleSelective(@Param("record") Authentication record, @Param("example") AuthenticationExample example);

    int updateByExample(@Param("record") Authentication record, @Param("example") AuthenticationExample example);
}
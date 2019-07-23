package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.LoginToken;
import cn.edu.bupt.yaoxintong.pojo.LoginTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginTokenMapper {
    int countByExample(LoginTokenExample example);

    int deleteByExample(LoginTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoginToken record);

    int insertSelective(LoginToken record);

    List<LoginToken> selectByExample(LoginTokenExample example);

    LoginToken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoginToken record, @Param("example") LoginTokenExample example);

    int updateByExample(@Param("record") LoginToken record, @Param("example") LoginTokenExample example);

    int updateByPrimaryKeySelective(LoginToken record);

    int updateByPrimaryKey(LoginToken record);
}
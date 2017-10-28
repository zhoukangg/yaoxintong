package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.AuthenticationDianshang;
import cn.edu.bupt.yaoxintong.pojo.AuthenticationDianshangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthenticationDianshangMapper {
    int countByExample(AuthenticationDianshangExample example);

    int deleteByExample(AuthenticationDianshangExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthenticationDianshang record);

    int insertSelective(AuthenticationDianshang record);

    List<AuthenticationDianshang> selectByExample(AuthenticationDianshangExample example);

    AuthenticationDianshang selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthenticationDianshang record, @Param("example") AuthenticationDianshangExample example);

    int updateByExample(@Param("record") AuthenticationDianshang record, @Param("example") AuthenticationDianshangExample example);

    int updateByPrimaryKeySelective(AuthenticationDianshang record);

    int updateByPrimaryKey(AuthenticationDianshang record);
}
package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.YaoxintongUser;
import cn.edu.bupt.yaoxintong.pojo.YaoxintongUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YaoxintongUserMapper {
    int countByExample(YaoxintongUserExample example);

    int deleteByExample(YaoxintongUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(YaoxintongUser record);

    int insertSelective(YaoxintongUser record);

    List<YaoxintongUser> selectByExample(YaoxintongUserExample example);

    YaoxintongUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") YaoxintongUser record, @Param("example") YaoxintongUserExample example);

    int updateByExample(@Param("record") YaoxintongUser record, @Param("example") YaoxintongUserExample example);

    int updateByPrimaryKeySelective(YaoxintongUser record);

    int updateByPrimaryKey(YaoxintongUser record);
}
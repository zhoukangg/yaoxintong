package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.YaoxintongAdmin;
import cn.edu.bupt.yaoxintong.pojo.YaoxintongAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YaoxintongAdminMapper {
    int countByExample(YaoxintongAdminExample example);

    int deleteByExample(YaoxintongAdminExample example);

    int deleteByPrimaryKey(String id);

    int insert(YaoxintongAdmin record);

    int insertSelective(YaoxintongAdmin record);

    List<YaoxintongAdmin> selectByExample(YaoxintongAdminExample example);

    YaoxintongAdmin selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") YaoxintongAdmin record, @Param("example") YaoxintongAdminExample example);

    int updateByExample(@Param("record") YaoxintongAdmin record, @Param("example") YaoxintongAdminExample example);

    int updateByPrimaryKeySelective(YaoxintongAdmin record);

    int updateByPrimaryKey(YaoxintongAdmin record);
}
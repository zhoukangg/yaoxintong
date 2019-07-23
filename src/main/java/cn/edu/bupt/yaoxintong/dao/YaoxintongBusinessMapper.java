package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.YaoxintongBusiness;
import cn.edu.bupt.yaoxintong.pojo.YaoxintongBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YaoxintongBusinessMapper {
    int countByExample(YaoxintongBusinessExample example);

    int deleteByExample(YaoxintongBusinessExample example);

    int deleteByPrimaryKey(String id);

    int insert(YaoxintongBusiness record);

    int insertSelective(YaoxintongBusiness record);

    List<YaoxintongBusiness> selectByExample(YaoxintongBusinessExample example);

    YaoxintongBusiness selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") YaoxintongBusiness record, @Param("example") YaoxintongBusinessExample example);

    int updateByExample(@Param("record") YaoxintongBusiness record, @Param("example") YaoxintongBusinessExample example);

    int updateByPrimaryKeySelective(YaoxintongBusiness record);

    int updateByPrimaryKey(YaoxintongBusiness record);
}
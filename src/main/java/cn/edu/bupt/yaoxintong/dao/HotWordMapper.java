package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.HotWord;
import cn.edu.bupt.yaoxintong.pojo.HotWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotWordMapper {
    int countByExample(HotWordExample example);

    int deleteByExample(HotWordExample example);

    int deleteByPrimaryKey(String id);

    int insert(HotWord record);

    int insertSelective(HotWord record);

    List<HotWord> selectByExample(HotWordExample example);

    HotWord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HotWord record, @Param("example") HotWordExample example);

    int updateByExample(@Param("record") HotWord record, @Param("example") HotWordExample example);

    int updateByPrimaryKeySelective(HotWord record);

    int updateByPrimaryKey(HotWord record);
}
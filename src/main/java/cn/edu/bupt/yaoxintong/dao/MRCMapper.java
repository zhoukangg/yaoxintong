package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.MRC;
import cn.edu.bupt.yaoxintong.pojo.MRCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MRCMapper {
    int countByExample(MRCExample example);

    int deleteByExample(MRCExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MRC record);

    int insertSelective(MRC record);

    List<MRC> selectByExample(MRCExample example);

    MRC selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MRC record, @Param("example") MRCExample example);

    int updateByExample(@Param("record") MRC record, @Param("example") MRCExample example);

    int updateByPrimaryKeySelective(MRC record);

    int updateByPrimaryKey(MRC record);
}
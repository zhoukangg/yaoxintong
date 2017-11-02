package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.ClaimOrder;
import cn.edu.bupt.yaoxintong.pojo.ClaimOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClaimOrderMapper {
    int countByExample(ClaimOrderExample example);

    int deleteByExample(ClaimOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(ClaimOrder record);

    int insertSelective(ClaimOrder record);

    List<ClaimOrder> selectByExample(ClaimOrderExample example);

    ClaimOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ClaimOrder record, @Param("example") ClaimOrderExample example);

    int updateByExample(@Param("record") ClaimOrder record, @Param("example") ClaimOrderExample example);

    int updateByPrimaryKeySelective(ClaimOrder record);

    int updateByPrimaryKey(ClaimOrder record);
}
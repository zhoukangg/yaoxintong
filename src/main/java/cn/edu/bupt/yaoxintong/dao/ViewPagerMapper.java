package cn.edu.bupt.yaoxintong.dao;

import cn.edu.bupt.yaoxintong.pojo.ViewPager;
import cn.edu.bupt.yaoxintong.pojo.ViewPagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewPagerMapper {
    int countByExample(ViewPagerExample example);

    int deleteByExample(ViewPagerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ViewPager record);

    int insertSelective(ViewPager record);

    List<ViewPager> selectByExample(ViewPagerExample example);

    ViewPager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ViewPager record, @Param("example") ViewPagerExample example);

    int updateByExample(@Param("record") ViewPager record, @Param("example") ViewPagerExample example);

    int updateByPrimaryKeySelective(ViewPager record);

    int updateByPrimaryKey(ViewPager record);
}
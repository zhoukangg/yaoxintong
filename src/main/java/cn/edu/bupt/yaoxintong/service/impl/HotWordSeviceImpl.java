package cn.edu.bupt.yaoxintong.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bupt.yaoxintong.dao.HotWordMapper;
import cn.edu.bupt.yaoxintong.pojo.HotWord;
import cn.edu.bupt.yaoxintong.pojo.HotWordExample;
import cn.edu.bupt.yaoxintong.pojo.HotWordExample.Criteria;
import cn.edu.bupt.yaoxintong.service.HotWordSevice;
import cn.edu.bupt.yaoxintong.util.ReturnModel;
import cn.edu.bupt.yaoxintong.util.StringUtil;

@Service
public class HotWordSeviceImpl implements HotWordSevice{
	@Autowired HotWordMapper hotWordMapper;
	
	/**
	 * 获取所有的记录
	 */
	@Override
	public ReturnModel getAllHotWord()
	{
		ReturnModel result = new ReturnModel();
		
		HotWordExample example =new HotWordExample();
		List<HotWord> list=hotWordMapper.selectByExample(example);
		if(list.size()>6)
			result.setDatum(list.subList(0, 6));
		else
			result.setDatum(list);
		result.setResult(list!=null);
        return result;
	}
	
	/**
	 * 根据id获取记录
	 */
	@Override
	public ReturnModel getHotWord(String id)
	{
		ReturnModel result = new ReturnModel();
		HotWord word= hotWordMapper.selectByPrimaryKey(id);
		result.setResult(word!=null);
        result.setDatum(word);
        return result;
	}
	
	/**
	 * 修改热词
	 */
	@Override
	public ReturnModel  modifyHotWord(String id, String words)
	{
		ReturnModel result = new ReturnModel();
		if(StringUtil.isEmpty(id) || StringUtil.isEmpty(words))
		{
			result.setResult(false);
	        result.setDatum(0);
	        return result;
		}
		else
		{
			HotWordExample example=new HotWordExample();
			Criteria creatCriteria=example.createCriteria();
			creatCriteria.andWordsEqualTo(words);
			List<HotWord> list= hotWordMapper.selectByExample(example);		
			if (list.isEmpty())
			{
				HotWord word = hotWordMapper.selectByPrimaryKey(id);
				word.setWords(words);
				int i=hotWordMapper.updateByPrimaryKey(word);
				result.setResult(i>0);
		        result.setDatum(i);
		        return result;
			}
			else
			{
				result.setResult(false);
		        result.setDatum(0);
		        return result;
			}
		}		
		
	}
	
	/**
	 * 新增记录
	 */
	@Override
	public ReturnModel increaseHotWord(String words)
	{
		ReturnModel result = new ReturnModel();
		if(StringUtil.isEmpty(words))
		{
			result.setResult(false);
	        result.setDatum(0);
	        return result;
		}
		else 
		{
			HotWordExample example =new HotWordExample();
			Criteria creatCriteria=example.createCriteria();
			creatCriteria.andWordsEqualTo(words);
			List<HotWord> list =hotWordMapper.selectByExample(example);
			if(list.isEmpty())
			{
				HotWord word=new HotWord();
				word.setId(UUID.randomUUID().toString().replaceAll("-", ""));
				word.setWords(words);
				int i=hotWordMapper.insert(word);
				result.setResult(i>0);
		        result.setDatum(i);
		        return result;
			}
			else
			{
				result.setResult(false);
		        result.setDatum(0);
		        return result;
			}	
		}
		
	}
	
	/**
	 * 根据id删除记录
	 */
	@Override
	public ReturnModel deleteHotWord(String id)
	{
		ReturnModel result = new ReturnModel();
		HotWordExample example=new HotWordExample();
		Criteria creatCriteria=example.createCriteria();
		creatCriteria.andIdEqualTo(id);
		int i=hotWordMapper.deleteByExample(example);
		result.setResult(i>0);
        result.setDatum(i);
        return result;
	}

}

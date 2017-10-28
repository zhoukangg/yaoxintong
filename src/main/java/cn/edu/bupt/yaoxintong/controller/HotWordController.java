package cn.edu.bupt.yaoxintong.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.bupt.yaoxintong.service.HotWordSevice;
import cn.edu.bupt.yaoxintong.util.ReturnModel;

@Controller
public class HotWordController {
	@Autowired
	HotWordSevice hotWordSevice;
	
	/**
	 * 获取所有热词记录
	 * @return
	 */
	@RequestMapping("/getAllHotWord")
	@ResponseBody
	public ReturnModel  allHotWord(HttpServletResponse response)
	{
		response.reset();
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		return hotWordSevice.getAllHotWord();
	}
	
	/**
	 * 根据id获取热词记录
	 * @param id
	 * @return
	 */
	@RequestMapping("/getHotWord/{id}")
	@ResponseBody
	public ReturnModel HotWord(@PathVariable String id,HttpServletResponse response)
	{
		response.reset();
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		return hotWordSevice.getHotWord(id);
	}

	/**
	 * 根据id修改热词记录
	 * @param id
	 * @param words
	 * @return
	 */
	@RequestMapping("/modifyHotWord/{id}/{words}")
	@ResponseBody
	public ReturnModel modify(@PathVariable String id,@PathVariable String words,HttpServletResponse response)
	{
		response.reset();
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		return hotWordSevice.modifyHotWord(id,words);
	}
	
	/**
	 * 新增热词记录
	 * @param words
	 * @return
	 */
	@RequestMapping("/increaseHotWord/{words}")
	@ResponseBody
	public ReturnModel increase(@PathVariable String words,HttpServletResponse response)
	{
		response.reset();
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		return hotWordSevice.increaseHotWord(words);
	}
	
	/**
	 * 删除热词记录
	 */
	@RequestMapping("/deleteHotWord/{id}")
	@ResponseBody
	public ReturnModel delete(@PathVariable String id,HttpServletResponse response)
	{
		response.reset();
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		return hotWordSevice.deleteHotWord(id);
	}
	
}

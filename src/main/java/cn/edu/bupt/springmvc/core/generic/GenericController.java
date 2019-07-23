package cn.edu.bupt.springmvc.core.generic;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cn.edu.bupt.springmvc.web.model.Result;

/**
 * 所有自定义Controller的顶级接口,封装常用的与session和response、request相关的操作
 *
 * Created by FirenzesEagle on 2016/4/19 0019.
 */
public abstract class GenericController {

    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(getClass());
    protected Result result;
    GsonBuilder builder = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls();
    Gson gson = builder.create();
    protected String renderSuccessString(HttpServletResponse response,Object object) {
    	result = new Result();
    	result.setResult(true);
    	result.setDatum(object);
    	result.setReason(null);
    	return renderString(response,gson.toJson(result),"application/json");
    }
    
    protected String renderErrorString(HttpServletResponse response,String reason) {
    	result = new Result();
    	result.setResult(false);
    	result.setDatum(null);
    	result.setReason(reason);
    	return renderString(response,gson.toJson(result),"application/json");
    }
    /**
     * 客户端返回JSON字符串
     * @param response
     * @param object
     * @return
     */
/*    protected String renderString(HttpServletResponse response, Object object) {
        return renderString(response, new Gson().toJson(object));
    }*/

    /**
     * 客户端返回字符串
     * @param response
     * @param string
     * @return
     */
    protected String renderString(HttpServletResponse response, String string,String type) {
        try {
        	
            response.reset();
            response.setCharacterEncoding("utf-8");
            response.setContentType(type);
            response.setHeader("Access-Control-Allow-Origin","*");
            response.getWriter().write(string);
            return null;
        } catch (IOException e) {
            return null;
        }
    }

}

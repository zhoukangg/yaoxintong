package cn.edu.bupt.yaoxintong.util;

import org.springframework.core.convert.converter.Converter;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Administrator on 2016/10/20 0020.
 */
public class CustomDateConverter implements Converter<String,Date> {
    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      //  System.out.println("fuck!fuck!fuck!fuck!fuck!fuck!fuck!fuck!fuck!fuck!!!!!!!");
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package cn.edu.bupt.yaoxintong.util;

/**
 * author:sunnymarkliu
 * date  :16-9-19
 * time  :下午12:53
 */
public class StringUtil {

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
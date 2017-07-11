package com.tfy.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 * Created by tanfy on 2017/7/10.
 */
public class DateUtil {
    /**
     * @param date Date
     * @author String 日期转换成字符串 格式[yyyy/MM/dd HH:mm:ss]
     **/
    public static String dateToString(Date date) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (date == null)
            return "";
        return df.format(date);
    }
}

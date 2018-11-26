package com.qa.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/26
 * Time: 下午7:15
 */
public class getBeforeDate {
    public String getBeforeDate(int n) {

        // 获取今天的日期
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -n);
        String today = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());

        return today;
//        Date date = new Date();
//        int year, month, day;
//        date.setDate(date.getDate() - n);
//        year = date.getYear();
//        month = date.getMonth() + 1;
//        day = date.getDate();
//        int s = year + '-' + (month < 10 ? ('0' + month) : month) + '-' + (day < 10 ? ('0' + day) : day);
//        return s;
    }
}

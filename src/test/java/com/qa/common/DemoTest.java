package com.qa.common;

import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/12/20
 * Time: 上午10:44
 */
public class DemoTest {
    @Test
    public static void test() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d1 = df.parse("2019-01-21 09:00:22");
            Date d2 = df.parse("2019-01-21 18:14:23");
            long diff = d1.getTime() - d2.getTime();//这样得到的差值是微秒级别
            long days = diff / (1000 * 60 * 60 * 24);

            long hours = (diff - days * (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
            long minutes = (diff - days * (1000 * 60 * 60 * 24) - hours * (1000 * 60 * 60)) / (1000 * 60);

            System.out.println("" + days + "天" + hours + "小时" + minutes + "分");

        } catch (Exception e) {
        }

    }
}

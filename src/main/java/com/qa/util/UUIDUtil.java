package com.qa.util;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/22
 * Time: 下午5:36
 */
public class UUIDUtil {

    public UUIDUtil() {
    }

    public static String getUUID() {

        return UUID.randomUUID().toString().replace("-", "");
    }


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("ss[" + i + "]=====" + getUUID());
        }
    }
}

package com.qa.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 19/6/27
 * Time: 下午4:34
 */
public class DateTimeUtil {


    public static final String Y_M_D = "yyyy-MM-dd";
    public static final String Y_M_D_H = "yyyy-MM-dd HH";
    public static final String YMD = "yyyyMMdd";
    public static final String YMDHM = "yyyy年MM月dd日 HH时:mm分";
    public static final String YMDHMS = "yyyy-MM-dd HH:mm:ss";
    public static final String YMDHMSS = "yyyyMMddHHmmssSSS";

    private DateTimeUtil(){
        //
    }

    public static long getLeftSec(){
        LocalDateTime midnight = LocalDateTime.now().plusDays(1).withHour(0).withMinute(0).withSecond(0).withNano(0);

//        long millSeconds = ChronoUnit.MILLIS.between(LocalDateTime.now(),midnight);
        return ChronoUnit.SECONDS.between(LocalDateTime.now(), midnight);
    }

    public static long getLeftSundaySec(){
        long leftSec = getLeftSec();
        long left = 24*3600*(7 - LocalDate.now().getDayOfWeek().getValue());
        return left+leftSec;
    }

    public static Date parseDate(String dateString, String pattern){
        DateFormat dateFormat = new SimpleDateFormat(Y_M_D_H);
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new Error(e);
        }
    }
    public static Date localDateTimeToDate(LocalDateTime localDateTime) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return Date.from(instant);
    }

    public static LocalDateTime dateToLocalDateTime(Date date) {
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        return instant.atZone(zoneId).toLocalDateTime();
    }

    public static Date getDateLater(long day,long minusSecond){
//      LocalDateTime midnight = LocalDateTime.now().minusDays(day).withHour(0).withMinute(0).withSecond(0).withNano(0);
        LocalDateTime midnight = LocalDateTime.now().plusDays(day).withHour(0).withMinute(0).withSecond(0).withNano(0).minusSeconds(minusSecond);
        long millSeconds = ChronoUnit.MILLIS.between(LocalDateTime.now(),midnight);
        return new Date(System.currentTimeMillis() + millSeconds);
    }

    public static String classicFormat(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern(YMDHMS);
        LocalDateTime time = LocalDateTime.now();
        return df.format(time);
    }

    public static String dateFormat(String pattern){
        DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime time = LocalDateTime.now();
        return df.format(time);
    }

    public static String dateFormat(String pattern,long minusDay){
        DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime time = LocalDateTime.now().plusDays(minusDay).withHour(0).withMinute(0).withSecond(0).withNano(0);
        return df.format(time);
    }

    public static String dateFormatHour(String pattern,int minusHour){
        DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime time = LocalDateTime.now().plusHours(minusHour).withMinute(0).withSecond(0).withNano(0);
        return df.format(time);
    }

    public static Long classicFormat(String date){
        DateTimeFormatter df = DateTimeFormatter.ofPattern(YMDHMS);
        LocalDateTime time = LocalDateTime.parse(date,df);
        return time.toInstant(ZoneOffset.of("+8")).toEpochMilli();
    }

    public static int getBetweenDay(LocalDate before,LocalDate after){
        return after.getDayOfYear() - before.getDayOfYear();
    }
}

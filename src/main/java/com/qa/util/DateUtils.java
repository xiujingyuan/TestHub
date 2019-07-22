package com.qa.util;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 19/4/29
 * Time: 下午3:13
 * <p>
 * 日期工具类, 继承org.apache.commons.lang.time.DateUtils类
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {

    /**
     * 得到当前日期字符串 格式（yyyy-MM-dd）
     */
    public static String getDate() {
        return getDate("yyyy-MM-dd");
    }

    private static String[] parsePatterns = {
            "yyyyMMdd",
            "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM",
            "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
            "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM",
            "yyyyMMddHHmmss", "yyyy/MM/dd HH:mm:ss.SSS"};

    /**
     * 得到当前日期字符串 格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
     */
    public static String getDate(String pattern) {
        return DateFormatUtils.format(new Date(), pattern);
    }

    /**
     * 得到日期字符串 默认格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
     */
    public static String formatDate(Date date, Object... pattern) {
        String formatDate = null;
        if (pattern != null && pattern.length > 0) {
            formatDate = DateFormatUtils.format(date, pattern[0].toString());
        } else {
            formatDate = DateFormatUtils.format(date, "yyyy-MM-dd");
        }
        return formatDate;
    }

    /**
     * 得到日期时间字符串，转换格式（yyyy-MM-dd HH:mm:ss）
     */
    public static String formatDateTime(Date date) {
        return formatDate(date, "yyyy-MM-dd HH:mm:ss");
    }


    /**
     * 得到日期时间字符串，转换格式（yyyy-MM-dd HH:mm:ss）
     */
    public static String formatDateTimeString(Date date) {
        return formatDate(date, "yyyyMMddHHmmsssss");
    }

    /**
     * 得到当前时间字符串 格式（HH:mm:ss）
     */
    public static String getTime() {
        return formatDate(new Date(), "HH:mm:ss");
    }

    /**
     * 得到当前日期和时间字符串 格式（yyyy-MM-dd HH:mm:ss）
     */
    public static String getDateTime() {
        return formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 得到当前年份字符串 格式（yyyy）
     */
    public static String getYear() {
        return formatDate(new Date(), "yyyy");
    }

    /**
     * 得到当前月份字符串 格式（MM）
     */
    public static String getMonth() {
        return formatDate(new Date(), "MM");
    }

    /**
     * 得到当天字符串 格式（dd）
     */
    public static String getDay() {
        return formatDate(new Date(), "dd");
    }

    /**
     * 得到当前星期字符串 格式（E）星期几
     */
    public static String getWeek() {
        return formatDate(new Date(), "E");
    }

    /**
     * 日期型字符串转化为日期 格式
     * { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm",
     * "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm",
     * "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm" }
     */
    public static Date parseDate(Object str) {
        if (str == null) {
            return null;
        }
        try {
            return parseDate(str.toString(), parsePatterns);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 获取过去的天数
     *
     * @param date
     * @return
     */
    public static long pastDays(Date date) {
        long t = new Date().getTime() - date.getTime();
        return t / (24 * 60 * 60 * 1000);
    }

    /**
     * 获取过去的小时
     *
     * @param date
     * @return
     */
    public static long pastHour(Date date) {
        long t = new Date().getTime() - date.getTime();
        return t / (60 * 60 * 1000);
    }

    /**
     * 获取过去的分钟
     *
     * @param date
     * @return
     */
    public static long pastMinutes(Date date) {
        long t = new Date().getTime() - date.getTime();
        return t / (60 * 1000);
    }

    /**
     * 转换为时间（天,时:分:秒.毫秒）
     *
     * @param timeMillis
     * @return
     */
    public static String formatDateTime(long timeMillis) {
        long day = timeMillis / (24 * 60 * 60 * 1000);
        long hour = (timeMillis / (60 * 60 * 1000) - day * 24);
        long min = ((timeMillis / (60 * 1000)) - day * 24 * 60 - hour * 60);
        long s = (timeMillis / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        long sss = (timeMillis - day * 24 * 60 * 60 * 1000 - hour * 60 * 60 * 1000 - min * 60 * 1000 - s * 1000);
        return (day > 0 ? day + "," : "") + hour + ":" + min + ":" + s + "." + sss;
    }

    /**
     * 获取两个日期之间的天数
     *
     * @param before
     * @param after
     * @return
     */
    public static double getDistanceOfTwoDate(Date before, Date after) {
        long beforeTime = before.getTime();
        long afterTime = after.getTime();
        return (afterTime - beforeTime) / (1000 * 60 * 60 * 24);
    }

    /**
     * @Description 获取最大天数差
     * @Author Peter
     * @Date ${DATE}
     */
    public static int getMaxDistanceOfTwoDate(Date before, Date after) {
        long beforeTime = before.getTime();
        long afterTime = after.getTime();
        long res = afterTime - beforeTime;
        if (res < 0) {
            return 0;
        }
        return (int) ((afterTime - beforeTime) / (1000 * 60 * 60 * 24) + 0.5);
    }

    //返回本周周一的日期
    public static Date getCurrentMonday() {
        int mondayPlus = getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus);
        Date monday = currentDate.getTime();
        monday.setHours(0);
        monday.setMinutes(0);
        monday.setSeconds(0);
        return monday;
    }

    //返回本周周日的日期
    public static Date getPreviousSunday() {
        int mondayPlus = getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 6);
        Date sunday = currentDate.getTime();
        sunday.setHours(23);
        sunday.setMinutes(59);
        sunday.setSeconds(59);
        return sunday;
    }

    private static int getMondayPlus() {
        Calendar cd = Calendar.getInstance();
        // 获得今天是一周的第几天，星期日是第一天，星期二是第二天......
        int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == 1) {
            return -6;
        } else {
            return 2 - dayOfWeek;
        }
    }

    public static Date getStartTime() {
        return getStartTime(new Date());
    }

    public static Date getStartTime(Date startDate) {
        Calendar todayStart = Calendar.getInstance();
        todayStart.setTime(startDate);
        todayStart.set(Calendar.HOUR_OF_DAY, 0);
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);
        return todayStart.getTime();
    }

    public static Date getEndTime() {
        Date endDate = new Date();
        return getEndTime(endDate);
    }

    public static Date getEndTime(Date endDate) {
        Calendar todayEnd = Calendar.getInstance();
        todayEnd.setTime(endDate);
        todayEnd.set(Calendar.HOUR_OF_DAY, 23);
        todayEnd.set(Calendar.MINUTE, 59);
        todayEnd.set(Calendar.SECOND, 59);
        todayEnd.set(Calendar.MILLISECOND, 999);
        return todayEnd.getTime();
    }

    /**
     * @Description 获得某一天零点的时间戳
     * @Author Peter
     * @Date ${DATE}
     */
    public static Date getDateMorningTime(Date date) {
        return getStartTime(date);
    }

    /**
     * 获得某一天晚上的时间戳
     *
     * @param date 某一天
     * @return 晚上的时间
     */
    public static Date getDateNightTime(Date date) {
        return getEndTime(date);
    }

    public static Date getDateOfNextMorning(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }


    public static Date getBeforeTime(int i) throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        cal.add(Calendar.DATE, -i);
        String date = sdf.format(cal.getTime());
        Date date1 = sdf.parse(date);
        return date1;
    }

    public static Date getAfterTime(int i) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, i);
        return cal.getTime();
    }

    public static Date getAfterDateStartTime(int i) {
        Calendar calendar = Calendar.getInstance();
        if (i != 0) calendar.add(Calendar.DATE, i);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date getAfterDateEndTime(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, i);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }

    public static Date getBeforeTime(int i, Date startDate){
        Calendar cal=Calendar.getInstance();
        cal.setTime(startDate);
        cal.add(Calendar.DATE, i);
        return cal.getTime();
    }

    public static String getBeforeTime(int i, String fmtStr) throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(StringUtils.isEmpty(fmtStr) ? "yyyy-MM-dd hh:mm:ss" : fmtStr);
        cal.add(Calendar.DATE, -i);
        String date = sdf.format(cal.getTime());
        return date;
    }

    /**
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
//		System.out.println(formatDate(parseDate("2010/3/6")));
//		System.out.println(getDate("yyyy年MM月dd日 E"));
//		long time = new Date().getTime()-parseDate("2012-11-19").getTime();
//		System.out.println(time/(24*60*60*1000));
//		System.out.println(getEndTime().toString());
//		Date endDate = new Date();
//		endDate.setHours(23);
//		endDate.setMinutes(59);
//		endDate.setSeconds(59);(int)(Math.random()*900)+100
//		System.out.println(endDate);
        //System.out.println(getDateOfNextMonth(new Date()));
        //System.out.println(formatDate(getAfterTime(-(new Integer(10))),"yyyy-MM-dd"));
        String dateStr = "2018-12-01";
        Date date = parseDate(dateStr);
        System.out.println(formatDateTime(date));

    }

    public static Long convertToTimeStamp(String dateStr) {
        if (StringUtils.isNullOrEmpty(dateStr) || "null".equals(dateStr)) {
            return null;
        }
        try {
            return parseDate(dateStr).getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据入参时间返回当前月的第一天的时间
     *
     * @param date
     * @return
     */
    public static Date getFirstDayOfMonth(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 根据入参时间返回当前月最后的时间
     *
     * @param date
     * @return
     */
    public static Date getLastDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }

    /**
     * 两个时间间隔月份(自然月)
     *
     * @param startDate <String>
     * @param endDate   <String>
     * @return int
     * @throws ParseException
     */
    public static int getMonthSpace(String startDate, String endDate) {
        int result = 0;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar start = Calendar.getInstance();
            Calendar end = Calendar.getInstance();
            start.setTime(sdf.parse(startDate));
            end.setTime(sdf.parse(endDate));
            result = result + (end.get(Calendar.YEAR) - start.get(Calendar.YEAR)) * 12;
            result = result + end.get(Calendar.MONTH) - start.get(Calendar.MONTH);
        } catch (Exception e) {
        }
        return result == 0 ? 0 : Math.abs(result);
    }

    /**
     * 判断日期是否为月末
     */
    public static boolean isLastDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 1));
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            return true;
        }
        return false;
    }

    /**
     * 获取下个月的当前日期
     *
     * @param date
     * @return
     */
    public static Date getDayOfNextMonth(Date date) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 1);//把日期往后增加一个月.整数往后推,负数往前移动
        date = calendar.getTime();
        return date;
    }

    /**
     * 获取下个月月末日期
     *
     * @param date
     * @return
     */
    public static Date getDateOfNextMonth(Date date) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 1);//把日期往后增加一个月.整数往后推,负数往前移动
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        date = calendar.getTime();
        return date;
    }

    /**
     * 获取定义时间的日
     *
     * @param date
     * @return
     */

    public static int getMonthDay2Set(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return day;
    }

    /**
     * 获取自定义时间的下个月最后一天
     *
     * @param date
     * @return
     */

    public static int getNextMonthDay2Set(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public static Date getDateByMinute(Calendar cal, int min) throws ParseException {
        if (cal == null) {
            cal = Calendar.getInstance();
        }
        cal.add(Calendar.MINUTE, min);
        return cal.getTime();
    }

    public static Date getSpecialTime(Date date, int hour, int minute, int second) {
        Calendar todayStart = Calendar.getInstance();
        todayStart.setTime(date);
        todayStart.set(Calendar.HOUR_OF_DAY, hour);
        todayStart.set(Calendar.MINUTE, minute);
        todayStart.set(Calendar.SECOND, second);
        todayStart.set(Calendar.MILLISECOND, 0);
        return todayStart.getTime();
    }

    /**
     * 获取当月的具体日期
     *
     * @param date
     * @return
     */
    public static Date getDayWithDate(Integer date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.getTime();
    }

    public static Date getBeforeMonthDate(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -i);
        return calendar.getTime();
    }

    public static int getDateInMonth() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DAY_OF_MONTH);
    }
}


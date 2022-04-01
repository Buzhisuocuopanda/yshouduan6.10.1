package com.authine.cloudpivot.ext.utils;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 时间
 */
public class TimeUtil {

    public static Logger logger = LoggerFactory.getLogger(TimeUtil.class);

    /**
     * 得到本周周一
     *
     * @return yyyy-MM-dd
     */
    public static long getMondayOfThisWeek() throws Exception {
        String str = DateTime.now().dayOfWeek().withMinimumValue().toString("yyyy-MM-dd");
        return getTimeStamp(str + " 00:00:00");
    }


    /**
     * 得到本周周日
     *
     * @return yyyy-MM-dd
     */
    public static long getSundayOfThisWeek() throws Exception {
        String str = DateTime.now().dayOfWeek().withMaximumValue().toString("yyyy-MM-dd");
        return getTimeStamp(str + " 00:00:00");
    }

    /**
     * 获得某天最晚时间
     *
     * @return
     */
    public static Date getDayLatestTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.SECOND, -1);

        Date end = calendar.getTime();
        return end;
    }

    /**
     * 获得某天最早时间
     *
     * @return
     */
    public static Date getDayEarlyTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date start = calendar.getTime();
        return start;
    }

    /**
     * 得到时间戳
     *
     * @param date
     * @return
     */
    public static long getTimeStamp(Date date) {
        return date.getTime();
    }

    /**
     * 得到时间戳
     *
     * @param date
     * @return
     */
    public static long getTimeStamp(String date) throws Exception {
        return parseByStr(date).getTime();
    }

    /**
     * 得到格式化后的系统时间 精确到秒
     *
     * @param date
     * @return
     */
    public static String getSimpleTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);
        return time;
    }
    public static String getSimpleTimeNoSS(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String time = sdf.format(date);
        return time;
    }

    public static String getSimpleTime(String formatString, Long date) {
        if (StringUtils.isEmpty(formatString)) {
            formatString = "yyyy-MM-dd HH:mm:ss";
        }
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(formatString);
            String time = sdf.format(date);
            return time;
        } else {
            return null;
        }
    }

    /**
     * 一小时前
     *
     * @return
     */
    public static String getOneHoursAgoTime() {
        String result = "";
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, cal.get(Calendar.HOUR) - 1);
        result = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime());//获取到完整的时间
        return result;
    }

    /**
     * 一天之前
     *
     * @return
     */
    public static String getOneDayAgoTime() {
        String result = "";
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        result = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime());//获取到完整的时间
        return result;
    }

    /**
     * 三天之前
     *
     * @return
     */
    public static String getThreeDayAgoTime() {
        String result = "";
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 3);
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        result = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime());//获取到完整的时间
        return result;
    }


    /**
     * 得到日期，精确到天
     *
     * @param date
     * @return
     */
    public static String getDate(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd").format(date).toString();
    }

    /**
     * 字符串转DATE
     *
     * @param time
     * @return
     */
    public static Date parseByStr(String time) throws Exception {
        Date date = null;
        if (StringUtils.isNotEmpty(time) && !"null".equals(time) && !"NULL".equals(time)) {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                date = format.parse(time);
            } catch (ParseException e) {
                logger.error("字符串 <---- 日期 异常！！！" + e);
                throw new Exception("日期转换异常");
            }
        }
        return date;
    }

    /**
     * Date转String
     *
     * @param date
     * @return
     */
    public static String parseByDate(Date date) {
        String str = "";
        try {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            str = dateformat.format(date);
        } catch (Exception e) {
            logger.error("日期 ---> 字符串 异常！！！" + e);
        }
        return str;
    }

    /**
     * 重新格式化时间
     *
     * @param time
     * @return
     */
    public static String formatSimpleTime(String time) {
        if (StringUtils.isNotEmpty(time) && !"null".equals(time) && !"NULL".equals(time)) {
            DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            try {
                Date date = format.parse(time);
                format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                time = format.format(date);
            } catch (ParseException e) {
                logger.error("字符串 ---> 日期 异常！！！" + e.getMessage());
            }
        }
        return time;
    }

    /**
     * 得到格式化后的系统时间 精确到天
     *
     * @param date
     * @return
     */
    public static String getSimpleTimeOfDay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String time = sdf.format(date);
        return time;
    }

    /**
     * 得到昨天的日期
     *
     * @return
     */
    public static String getTomorrowSimpleTimeOfDay() {
        Date date = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String time = sdf.format(date);
        return time;
    }


    private static int weeks = 0;

    /**
     * 按周取天
     *
     * @param deferWeek 推迟周数 1本周，-1向前推迟一周，2下周，依次类推
     * @param deferDay  1为周一
     * @return
     */
    public static Date getWeekDate(int deferWeek, int deferDay) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.add(Calendar.DATE, deferWeek * 7);
        if (deferDay == Calendar.SUNDAY) {
            //如果是取本周日
            calendar.set(Calendar.DAY_OF_WEEK, 1);
        } else {
            calendar.set(Calendar.DAY_OF_WEEK, deferDay);
        }

        return calendar.getTime();
    }

    /**
     * 取出一周7天所有
     *
     * @param deferWeek 推迟周数 0本周，-1向前推迟一周，1下周，依次类推
     * @return
     */
    public static List<DateTime> getWeekDateList(int deferWeek) {
        List<DateTime> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.DATE, Calendar.MONDAY);
        DateTime dateTime = new DateTime(calendar);
        for (int i = 0; i < 7; i++) {
            dateTime.plusMonths(deferWeek);
            dateTime = dateTime.plusDays(i);
            list.add(dateTime);
            dateTime = dateTime.plusDays(-i);
        }
        return list;
    }

    /**
     * 获取本月最后一天日期
     *
     * @return
     */
    public static Date getDefaultDay() {
        Calendar lastDate = Calendar.getInstance();
        lastDate.set(5, 1);
        lastDate.add(2, 1);
        lastDate.add(5, -1);
        return lastDate.getTime();
    }

    /**
     * 获取上月第一天日期
     *
     * @return
     */
    public static Date getPreviousMonthFirst() {
        Calendar lastDate = Calendar.getInstance();
        lastDate.set(5, 1);
        lastDate.add(2, -1);
        return lastDate.getTime();
    }

    /**
     * 获取本月第一天日期
     *
     * @return
     */
    public static Date getFirstDayOfMonth() {
        Calendar lastDate = Calendar.getInstance();
        lastDate.set(5, 1);
        return lastDate.getTime();
    }


    private static int getMondayPlus() {
        Calendar cd = Calendar.getInstance();
        int dayOfWeek = cd.get(7) - 1;
        if (dayOfWeek == 1) {
            return 0;
        }
        return (1 - dayOfWeek);
    }

    /**
     * 获取上周日日期
     *
     * @return
     */
    public static long getSundayOfPreWeek() throws Exception {
        String str = DateTime.now().plusWeeks(-1).dayOfWeek().withMaximumValue().toString("yyyy-MM-dd");
        return getTimeStamp(str + " 00:00:00");
    }

    /**
     * 获取上周一日期
     *
     * @return
     */
    public static long getMondayOfPreWeek() throws Exception {
        String str = DateTime.now().plusWeeks(-1).dayOfWeek().withMinimumValue().toString("yyyy-MM-dd");
        return getTimeStamp(str + " 00:00:00");
    }

    /**
     * 获取上月最后一天的日期
     *
     * @return
     */
    public static Date getPreviousMonthEnd() {
        Calendar lastDate = Calendar.getInstance();
        lastDate.add(2, -1);
        lastDate.set(5, 1);
        lastDate.roll(5, -1);
        return lastDate.getTime();
    }

    /**
     * 判断时间是否在时间段内
     * @param nowTime
     * @param beginTime
     * @param endTime
     * @return
     */
    public static boolean belongCalendar(Date nowTime, Date beginTime, Date endTime) {
        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(beginTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取往后n天的日期
     */


    public   static String setTilteMessage(Integer day) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            Date date = sdf.parse(getSimpleTime(new Date()));
            Calendar   calendar   =   new GregorianCalendar();
            calendar.setTime(date);
            calendar.add(calendar.DATE,day);//把日期往后增加一天.整数往后推,负数往前移动
            date=calendar.getTime();   //这个时间就是日期往后推一天的结果
            String putDate = sdf.format(date); //增加一天后的日期
            return putDate;

    }


    public   static Date setTilteMessageTime(Integer day) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = sdf.parse(getSimpleTime(new Date()));
        Calendar   calendar   =   new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE,day);//把日期往后增加一天.整数往后推,负数往前移动
        date=calendar.getTime();   //这个时间就是日期往后推一天的结果
        return date;

    }
    public static void main(String[] args) {
        Date weekDate = getWeekDate(0, 2);
        System.out.println(weekDate);
    }
    /**
     * 通过date截取年月日
     */

//    public   static String getYearMd(Date  date) {
//
//        getSimpleTime()
//
//    }



        /**
         * 通过date截取 时分
         */




}
package com.lamnt.trainning;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExam {
    public static Date parseDateFromString(String sDate) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = format.parse(sDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String getFirstDayOfMonth(String sDate) {
        Date date = parseDateFromString(sDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        return parseStringFromDate(calendar.getTime(), "yyyy/MM/dd");
    }

    public static String getLastDayOfMonth(String sDate) {
        Date date = parseDateFromString(sDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return parseStringFromDate(calendar.getTime(), "yyyy/MM/dd");
    }

    public static String getFirstDayOfWeek(String sDate) {
        Date date = parseDateFromString(sDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
        return parseStringFromDate(calendar.getTime(), "yyyy/MM/dd");
    }

    public static long getOneHundredDayAfter(String sDate) {
        Date date = parseDateFromString(sDate);
        long ts = date.getTime();
        return ts;
    }

    public static long getTimestampFromDate(String sDate) {
        Date date = parseDateFromString(sDate);
        return date.getTime();
    }

    public static long getTimestampFromDateV2(String sDate) {
        Date target = parseDateFromString(sDate);
        long ts = target.getTime();
        String[] date = sDate.split(" ");
        String[] time = date[1].split(":");
        return ts / 1000 - Integer.parseInt(time[1]);
    }

    public static String getDateFromTimestamp(long timestamp) {
        Timestamp ts = new Timestamp(timestamp);
        Date date = new Date(ts.getTime() * 1000);
        return parseStringFromDate(date, "yyyy/MM/dd HH:mm:ss");
    }

    public static String getDateWithFormat(String sDate, String pattern) {
        Date date = parseDateFromString(sDate);
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(date);
    }

    public static String parseStringFromDate(Date date, String pattern) {
        SimpleDateFormat formater = new SimpleDateFormat(pattern);
        String sDate = formater.format(date);
        return sDate;
    }

}
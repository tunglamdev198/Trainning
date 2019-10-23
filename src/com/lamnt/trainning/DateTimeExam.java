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

    public static Date parseDateFromStringWithFormat(String sDate, String pattern) {
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


    public static String getOneHundredDayAfter(String sDate) {
        Date date = parseDateFromString(sDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 100);
        Date newDate = calendar.getTime();
        return parseStringFromDate(newDate, "yyyy/MM/dd");
    }

    public static void compareTwoDate(String dateOne, String dateTwo) {
        Date date1 = parseDateFromString(dateOne);
        Date date2 = parseDateFromString(dateTwo);
        if (date1.compareTo(date2) > 0) {
            System.out.println("Ngày " + dateOne + " sau ngày " + dateTwo);
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Ngày " + dateOne + " trước ngày " + dateTwo);
        } else System.out.println("2 ngày trùng nhau");
    }

    public static void countTimeFromTwoDate(String dateOne, String dateTwo) {
        Date date1 = parseDateFromString(dateOne);
        Date date2 = parseDateFromString(dateTwo);
        long ts1 = date1.getTime();
        long ts2 = date2.getTime();
        long diff = ts2 - ts1;
        int day = (int) (diff / (1000 * 24 * 60 * 60));
        int month = day / 30;
        int carryDay = day % 30;
        int year = month / 12;
        int carryMonth = month % 12;
        System.out.println("Kết quả: " + year + " năm " + (carryMonth) + " tháng " + (carryDay) + " ngày ");
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

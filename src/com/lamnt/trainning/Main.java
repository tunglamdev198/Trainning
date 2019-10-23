package com.lamnt.trainning;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bài 1:");
        System.out.println("1. Tổng 5 số tự nhiên : " + Bai1.sum(5));
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(-4);
        a.add(5);
        System.out.println("2.Sắp xếp dãy số nguyên");
        System.out.println("Danh sách ban đầu:");
        System.out.println(a.toString());
        Bai1.sort(a);
        System.out.println("Danh sách sắp xếp tăng dần:");
        System.out.println(a.toString());


        System.out.println("\nBài 2: \n");
        List<Bill> bills = new ArrayList<>();
        bills.add(new Bill(1, "HD1", 2000000, "2019-10-20"));
        bills.add(new Bill(2, "HD2", 3000000, "2019-10-20"));
        bills.add(new Bill(3, "HD3", 800000, "2019-10-10"));
        bills.add(new Bill(4, "HD4", 1200000, "2019-10-21"));
        bills.add(new Bill(5, "HD5", 1000000, "2019-10-18"));
        bills.add(new Bill(6, "HD6", 1000000, "2019-10-20"));
        BillManager billManager = new BillManager(bills);
        billManager.sortBillAsc();
        System.out.println("Danh sách hóa đơn tăng dần theo money :");
        System.out.println(bills.toString());

        System.out.println("Danh sách ngày :");
        System.out.println(billManager.getDates().toString());

        List<Bill> results = billManager.getBillsByMoney();
        System.out.println("Danh sách hóa đơn có money trên 1000000: ");
        System.out.println(results.toString());

        System.out.println("HashMap danh sách hóa đơn theo ngày: ");
        System.out.println(billManager.getHMBillsByDate().toString());

        System.out.println("List của list hóa đơn theo ngày: ");
        System.out.println(billManager.getListBillByDate().toString());

        String s = "getLastCharacter";
        System.out.println("Chuỗi: " + s);
        s = s.toLowerCase();
        System.out.println("Số lần kí tự n xuất hiện:" + StringExam.countCharacter(s, 'a'));
        System.out.println("Lần đầu xuất hiện: " + StringExam.getFirstCharacter(s, 'a'));
        System.out.println("lần cuối xuất hiện: " + StringExam.getLastCharacter(s, 'a'));
        System.out.println("Lần thứ 2 xuất hiện kí tự n: " + StringExam.getCharAt(s, 'a', 2));
        System.out.println("Các chuỗi con của abcdcdbe: " + StringExam.getAllSubString("abcd"));

        List<String> strings = new ArrayList<>();
        strings.add("Nguyễn");
        strings.add("Tùng Lâm");
        strings.add("1998");
        System.out.println(StringExam.genStringFromList(strings));

        s = "Nguyễn Tùng Lâm,";
        s = StringExam.replaceString(s, "Lâm", "My");
        System.out.println(s);

        System.out.println(StringExam.findCharacterMostAppear("aaabcdjsa"));

        System.out.println("Ngày test:");
        Date date = DateTimeExam.parseDateFromString("2019-07-15 20:15:20");
        System.out.println(date.toString());
        DateTimeExam.compareTwoDate("2019-07-15 20:15:20","2019-08-15 20:15:20");
        DateTimeExam.countTimeFromTwoDate("2019-07-15 20:15:20","2019-09-16 20:15:20");
        System.out.println(DateTimeExam.getFirstDayOfMonth("2019-07-18 20:15:20"));
        System.out.println(DateTimeExam.getLastDayOfMonth("2019-07-18 20:15:20"));
        System.out.println(DateTimeExam.getFirstDayOfWeek("2019-07-18 20:15:20"));
        System.out.println(DateTimeExam.getOneHundredDayAfter("2019-07-18 20:15:20"));
        System.out.println("" + DateTimeExam.getTimestampFromDateV2("2019-07-18 20:15:20"));
        System.out.println("" + DateTimeExam.getDateWithFormat("2019-07-15 20:15:20", "yyyy-MM-dd HH:mm:ss"));
        System.out.println("" + DateTimeExam.getDateWithFormat("2019-07-15 20:15:20", "MMM yyyy,dd HH:mm:ss "));

    }
}

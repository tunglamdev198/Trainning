package com.lamnt.trainning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BillManager {
    private List<Bill> bills;

    public BillManager(List<Bill> bills) {
        this.bills = bills;
    }

    public void sortBillAsc() {
        Collections.sort(bills);
    }

    public List<Bill> getBillsByMoney() {
        List<Bill> result = new ArrayList<>();
        for (Bill bill : bills) {
            if (bill.getMoney() > 1000000) {
                result.add(bill);
            }
        }
        return result;
    }

    // Lay danh sach ngay cua danh sach Hoa don

    private List<String> getDates(List<Bill> bills) {
        List<String> dates = new ArrayList<>();
        if (bills.isEmpty()) {
            return dates;
        }
        String date = bills.get(0).getDate();
        dates.add(date);
        int length = bills.size();
        for (int i = 1; i < length; i++) {
            String sDate = bills.get(i).getDate();
            if (!sDate.equals(date)) {
                dates.add(sDate);
                date = sDate;
            }
        }
        return dates;
    }

    // Lay danh sach hoa don theo tung ngay

    private List<Bill> getBillsByDate(String date) {
        List<Bill> result = new ArrayList<>();
        for (Bill bill : bills) {
            if (bill.getDate().equals(date)) {
                result.add(bill);
            }
        }
        return result;
    }

    // Tra ve hashmap voi key = ngay, value = danh sach hoa don theo ngay do

    public HashMap<String, List<Bill>> getHMBillsByDate() {
        HashMap<String, List<Bill>> results = new HashMap<>();
        List<String> dates = getDates(bills);
        for (String date : dates) {
            results.put(date, getBillsByDate(date));
        }
        return results;
    }

    // Tra ve List cua List bill theo ngay
    public List<List<Bill>> getListBillByDate() {
        List<List<Bill>> result = new ArrayList<>();
        List<String> dates = getDates(bills);
        for (String date : dates) {
            result.add(getBillsByDate(date));
        }
        return result;
    }
}

package com.lamnt.trainning;

import java.util.*;

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

    public List<String> getDates() {
        if (bills.isEmpty()) {
            return null;
        }
        Set<String> dates = new HashSet<>();
        for (int i = 0; i < bills.size(); i++) {
            dates.add(bills.get(i).getDate());
        }
        return new ArrayList<>(dates);
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
        for (Bill bill : bills) {
            String date = bill.getDate();
            if (!results.containsKey(date)) {
                List<Bill> billList = new ArrayList<>();
                billList.add(bill);
                results.put(date, billList);
            } else {
                results.get(date).add(bill);
            }
        }
        return results;
    }

    // Tra ve List cua List bill theo ngay
    public List<List<Bill>> getListBillByDate() {
        List<List<Bill>> result = new ArrayList<>();
        List<String> dates = getDates();
        for (String date : dates) {
            result.add(getBillsByDate(date));
        }
        return result;
    }
}

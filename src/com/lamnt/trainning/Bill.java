package com.lamnt.trainning;

public class Bill implements Comparable<Bill> {
    private int id;
    private String name;
    private long money;
    private String date;

    public Bill() {
    }

    public Bill(int id, String name, long money, String date) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", date='" + date + '\'' +
                '}' + "\n";
    }

    @Override
    public int compareTo(Bill o) {
        if (getMoney() == o.getMoney())
            return 0;
        else if (getMoney() > o.getMoney())
            return 1;
        else return -1;

    }
}


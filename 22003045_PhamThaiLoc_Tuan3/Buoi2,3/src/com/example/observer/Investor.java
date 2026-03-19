package com.example.observer;
public class Investor implements Observer {
    private String name;
    public Investor(String name) { this.name = name; }
    @Override
    public void update(String stockName, double price) {
        System.out.println("Thông báo tới " + name + ": Cổ phiếu " + stockName + " hiện có giá " + price);
    }
}
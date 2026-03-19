package com.example.decorator;
public class CreditCardPayment implements Payment {
    @Override
    public double getCost(double amount) { return amount; }
    @Override
    public void pay() { System.out.println("Thanh toán qua Thẻ tín dụng."); }
}
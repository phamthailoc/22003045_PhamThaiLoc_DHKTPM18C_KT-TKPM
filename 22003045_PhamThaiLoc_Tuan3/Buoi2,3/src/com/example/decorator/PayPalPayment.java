package com.example.decorator;
public class PayPalPayment implements Payment {
    @Override
    public double getCost(double amount) { return amount; }
    @Override
    public void pay() { System.out.println("Thanh toán qua PayPal."); }
}
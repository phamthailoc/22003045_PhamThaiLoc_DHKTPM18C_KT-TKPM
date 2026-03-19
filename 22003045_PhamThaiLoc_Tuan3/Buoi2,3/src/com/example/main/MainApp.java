package com.example.main;
import com.example.state.*;
import com.example.strategy.*;
import com.example.decorator.*;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("--- 1. TEST STATE PATTERN ---");
        Order order = new Order();
        order.process();
        order.process();
        order.process();

        System.out.println("\n--- 2. TEST STRATEGY PATTERN ---");
        Product p1 = new Product("Laptop", 1000, new VATTax());
        Product p2 = new Product("Ruou vang", 1000, new SpecialTax());
        System.out.println("Gia Laptop (+VAT): " + p1.getTotalPrice());
        System.out.println("Gia Ruou (+Thue dac biet): " + p2.getTotalPrice());

        System.out.println("\n--- 3. TEST DECORATOR PATTERN ---");
        Payment basicPayment = new CreditCardPayment();
        Payment fullOptionPayment = new DiscountDecorator(new ProcessingFeeDecorator(basicPayment));
        double finalAmount = fullOptionPayment.getCost(100.0);
        fullOptionPayment.pay();
        System.out.println("Tong tien cuoi cung: " + finalAmount);
    }
}
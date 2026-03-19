package com.example.decorator;
public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(Payment payment) { super(payment); }
    @Override
    public double getCost(double amount) { return super.getCost(amount) - 5.0; }
    @Override
    public void pay() {
        super.pay();
        System.out.println("- Đã áp dụng mã giảm giá: 5.0");
    }
}	
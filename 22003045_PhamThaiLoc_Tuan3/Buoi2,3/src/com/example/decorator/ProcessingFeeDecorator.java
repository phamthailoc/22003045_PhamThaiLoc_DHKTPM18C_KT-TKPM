package com.example.decorator;
public class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(Payment payment) { super(payment); }
    @Override
    public double getCost(double amount) { return super.getCost(amount) + 2.0; }
    @Override
    public void pay() {
        super.pay();
        System.out.println("- Đã cộng thêm phí xử lý: 2.0");
    }
}
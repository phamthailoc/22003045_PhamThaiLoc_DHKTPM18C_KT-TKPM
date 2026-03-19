package com.example.state;
public class ProcessingState implements OrderState {
    @Override
    public void handleRequest(Order order) {
        System.out.println("Trạng thái: Đang xử lý. Đang đóng gói và vận chuyển.");
        order.setState(new ShippedState());
    }
}
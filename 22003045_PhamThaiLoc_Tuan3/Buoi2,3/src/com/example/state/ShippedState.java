package com.example.state;
public class ShippedState implements OrderState {
    @Override
    public void handleRequest(Order order) {
        System.out.println("Trạng thái: Đã giao. Cập nhật trạng thái thành công.");
    }
}
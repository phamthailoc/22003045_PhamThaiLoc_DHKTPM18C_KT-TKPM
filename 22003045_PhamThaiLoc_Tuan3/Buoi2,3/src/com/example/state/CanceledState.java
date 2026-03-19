package com.example.state;
public class CanceledState implements OrderState {
    @Override
    public void handleRequest(Order order) {
        System.out.println("Trạng thái: Hủy. Đang hoàn tiền cho khách hàng.");
    }
}
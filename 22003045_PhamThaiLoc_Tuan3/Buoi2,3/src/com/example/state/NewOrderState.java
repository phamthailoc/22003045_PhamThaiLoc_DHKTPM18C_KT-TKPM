package com.example.state;
public class NewOrderState implements OrderState {
    @Override
    public void handleRequest(Order order) {
        System.out.println("Trạng thái: Mới tạo. Đang kiểm tra thông tin đơn hàng.");
        order.setState(new ProcessingState());
    }
}
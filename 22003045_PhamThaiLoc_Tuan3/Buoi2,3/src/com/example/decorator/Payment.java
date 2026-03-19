package com.example.decorator;
public interface Payment {
    double getCost(double amount);
    void pay();
}
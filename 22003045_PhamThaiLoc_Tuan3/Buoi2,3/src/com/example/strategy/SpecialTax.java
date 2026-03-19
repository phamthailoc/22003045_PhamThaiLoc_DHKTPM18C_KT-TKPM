package com.example.strategy;
public class SpecialTax implements TaxStrategy {
    @Override
    public double calculate(double price) { return price * 0.3; }
}
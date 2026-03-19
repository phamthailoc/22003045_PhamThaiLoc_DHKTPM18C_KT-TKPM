package com.example.observer;
import java.util.ArrayList;
import java.util.List;
public class Stock implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String name;
    private double price;
    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void updatePrice(double newPrice) {
        this.price = newPrice;
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer o) { observers.add(o); }
    @Override
    public void removeObserver(Observer o) { observers.remove(o); }
    @Override
    public void notifyObservers() {
        for (Observer o : observers) { o.update(name, price); }
    }
}
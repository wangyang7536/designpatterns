package org.ocean.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Item implements Subject {
    private int price;
    private List<Observer> observers = new ArrayList<>();

    public void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}

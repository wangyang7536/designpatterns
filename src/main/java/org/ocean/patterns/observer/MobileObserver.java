package org.ocean.patterns.observer;

public class MobileObserver implements Observer {
    @Override
    public void update(int price) {
        System.out.println("Mobile side found Price changed to: " + price);
    }
}

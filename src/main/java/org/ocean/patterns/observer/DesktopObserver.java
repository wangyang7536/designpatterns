package org.ocean.patterns.observer;

public class DesktopObserver implements Observer {
    @Override
    public void update(int price) {
        System.out.println("Desktop side found Price changed to: " + price);
    }
}

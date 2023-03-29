package org.ocean.patterns.observer;

import org.junit.Test;

public class ObserverPatternTest {
    @Test
    public void test() {
        MobileObserver mobileObserver = new MobileObserver();
        DesktopObserver desktopObserver = new DesktopObserver();
        Item item = new Item();
        item.registerObserver(mobileObserver);
        item.registerObserver(desktopObserver);

        item.setPrice(50);
        item.setPrice(100);
        item.setPrice(150);

        item.removeObserver(mobileObserver);
        item.setPrice(80);
    }
}

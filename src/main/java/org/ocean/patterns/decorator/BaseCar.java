package org.ocean.patterns.decorator;

public class BaseCar implements Car {

    @Override
    public int getPrice() {
        return 50000;
    }

    @Override
    public int getYear() {
        return 2022;
    }
}

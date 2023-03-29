package org.ocean.patterns.decorator;

public class LatestCarDecorator extends CarDecorator {
    public LatestCarDecorator(Car car) {
        super(car);
    }

    @Override
    public int getPrice() {
        return car.getPrice() + 1000;
    }

    @Override
    public int getYear() {
        return car.getYear() + 1;
    }
}

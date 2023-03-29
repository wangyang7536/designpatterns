package org.ocean.patterns.decorator;

public abstract class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public int getPrice() {
        return car.getPrice();
    }

    @Override
    public int getYear() {
        return car.getYear();
    }
}

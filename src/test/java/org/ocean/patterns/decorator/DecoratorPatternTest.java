package org.ocean.patterns.decorator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecoratorPatternTest {
    @Test
    public void test() {
        Car car = new BaseCar();
        assertEquals(car.getPrice(), 50000);
        assertEquals(car.getYear(), 2022);
        car = new LatestCarDecorator(car);
        assertEquals(car.getPrice(), 51000);
        assertEquals(car.getYear(), 2023);
    }
}

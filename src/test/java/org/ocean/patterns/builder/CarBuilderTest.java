package org.ocean.patterns.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarBuilderTest {
    @Test
    public void test() {
        Car car = new Car.CarBuilder(CarType.SEDAN, 5).setBrand("BMW").setMaxSpeed(200).setLength(10).build();
        assertEquals(car.getCarType(), CarType.SEDAN);
        assertEquals(car.getSeats(), 5);
        assertEquals(car.getBrand(), "BMW");
        assertEquals(car.getMaxSpeed(), 200);
        assertEquals(car.getLength(), 10);
    }
}

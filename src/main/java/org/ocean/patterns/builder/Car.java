package org.ocean.patterns.builder;

public class Car {
    private CarType carType;
    private int seats;
    private String brand;
    private int maxSpeed;
    private int length;

    private Car(CarBuilder carBuilder) {
        this.carType = carBuilder.carType;
        this.seats = carBuilder.seats;
        this.brand = carBuilder.brand;
        this.maxSpeed = carBuilder.maxSpeed;
        this.length = carBuilder.length;
    }

    public CarType getCarType() {
        return this.carType;
    }

    public int getSeats() {
        return this.seats;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getLength() {
        return this.length;
    }

    public static class CarBuilder {
        private CarType carType;
        private int seats;
        private String brand;
        private int maxSpeed;
        private int length;

        public CarBuilder(CarType carType, int seats) {
            this.carType = carType;
            this.seats = seats;
        }

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public CarBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

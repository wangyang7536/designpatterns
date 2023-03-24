package org.ocean.patterns.factory.method;

public class SuvFactoryClient extends VehicleFactoryClient {
    @Override
    Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("Jeep")) {
            return new Jeep();
        }
        return null;
    }
}

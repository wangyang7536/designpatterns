package org.ocean.patterns.factory.method;

public class SedanFactoryClient extends VehicleFactoryClient {
    @Override
    Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("bmw")) {
            return new Bmw();
        }
        return null;
    }
}

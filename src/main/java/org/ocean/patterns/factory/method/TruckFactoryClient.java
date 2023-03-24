package org.ocean.patterns.factory.method;

public class TruckFactoryClient extends VehicleFactoryClient {
    @Override
    Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("Caterpillar")) {
            return new Caterpillar();
        }
        return null;
    }
}

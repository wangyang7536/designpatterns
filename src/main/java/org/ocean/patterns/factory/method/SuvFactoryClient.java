package org.ocean.patterns.factory.method;

public class SuvFactoryClient extends VehicleFactoryClient {
    @Override
    Vehicle createVehicle(VehicleType type) {
        if (type.equals(VehicleType.JEEP)) {
            return new Jeep();
        }
        return null;
    }
}

package org.ocean.patterns.factory.method;

public class TruckFactoryClient extends VehicleFactoryClient {
    @Override
    Vehicle createVehicle(VehicleType type) {
        if (type.equals(VehicleType.CATERPILLAR)) {
            return new Caterpillar();
        }
        return null;
    }
}

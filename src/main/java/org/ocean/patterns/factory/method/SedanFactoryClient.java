package org.ocean.patterns.factory.method;

public class SedanFactoryClient extends VehicleFactoryClient {
    @Override
    Vehicle createVehicle(VehicleType type) {
        if (type.equals(VehicleType.BMW)) {
            return new Bmw();
        }
        return null;
    }
}

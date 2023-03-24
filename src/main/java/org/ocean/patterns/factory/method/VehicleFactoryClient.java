package org.ocean.patterns.factory.method;

public abstract class VehicleFactoryClient {

    public Vehicle orderVehicle(String type) {
        Vehicle vehicle = createVehicle(type);
        vehicle.assembly();
        return vehicle;
    }

    abstract Vehicle createVehicle(String type);
}

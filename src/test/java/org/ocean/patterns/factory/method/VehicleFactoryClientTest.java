package org.ocean.patterns.factory.method;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class VehicleFactoryClientTest {
    @Test
    public void testSedan() {
        VehicleFactoryClient sedanFactoryClient = new SedanFactoryClient();
        Vehicle vehicle = sedanFactoryClient.createVehicle(VehicleType.BMW);
        assertTrue(vehicle.getName().equals("BMW"));
    }

    @Test
    public void testSuv() {
        VehicleFactoryClient suvFactoryClient = new SuvFactoryClient();
        Vehicle vehicle = suvFactoryClient.createVehicle(VehicleType.JEEP);
        assertTrue(vehicle.getName().equals("JEEP"));
    }

    @Test
    public void testTruck() {
        VehicleFactoryClient truckFactoryClient = new TruckFactoryClient();
        Vehicle vehicle = truckFactoryClient.createVehicle(VehicleType.CATERPILLAR);
        assertTrue(vehicle.getName().equals("CATERPILLAR"));
    }
}

package org.ocean.patterns.factory.method;

public enum VehicleType {
    BMW, JEEP, CATERPILLAR;

    public static VehicleType getType(String type) {
        switch (type) {
            case "BMW":
                return VehicleType.BMW;
            case "JEEP":
                return VehicleType.JEEP;
            case "CATERPILLAR":
                return VehicleType.CATERPILLAR;
        }
        return null;
    }
}

package org.ocean.patterns.builder;

public enum CarType {
    SEDAN, TRUCK, VAN;

    public static CarType getType(String type) {
        switch (type) {
            case "SEDAN":
                return CarType.SEDAN;
            case "TRUCK":
                return CarType.TRUCK;
            case "VAN":
                return CarType.VAN;
        }
        return null;
    }
}

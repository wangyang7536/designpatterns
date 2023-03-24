package org.ocean.patterns.factory.method;

public class Jeep implements Suv {
    static final String name = "JEEP";

    public String getName() {
        return name;
    }

    @Override
    public void assembly() {
        System.out.println("Assembling Jeep");
    }
}

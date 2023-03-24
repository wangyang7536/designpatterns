package org.ocean.patterns.factory.method;

public class Caterpillar implements Truck {
    static final String name = "CATERPILLAR";

    public String getName() {
        return name;
    }
    @Override
    public void assembly() {
        System.out.println("Assembling Caterpillar");
    }
}

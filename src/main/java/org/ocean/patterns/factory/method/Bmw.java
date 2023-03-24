package org.ocean.patterns.factory.method;

public class Bmw implements Sedan {
    static final String name = "BMW";

    public String getName() {
        return name;
    }

    @Override
    public void assembly() {
        System.out.println("Assembling BMW");
    }
}

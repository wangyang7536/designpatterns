package org.ocean.patterns.singleton;

public class SingleObject {
    private String type = "Singleton";
    private static SingleObject singleObject = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return singleObject;
    }

    public String getType() {
        return type;
    }
}

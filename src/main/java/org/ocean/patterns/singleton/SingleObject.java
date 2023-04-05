package org.ocean.patterns.singleton;

public final class SingleObject {
    private String type = "Singleton";
    private static SingleObject INSTANCE;

    private SingleObject() {
    }

    public static synchronized SingleObject getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingleObject();
        }
        return INSTANCE;
    }

    public String getType() {
        return type;
    }
}

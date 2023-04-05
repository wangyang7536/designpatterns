package org.ocean.patterns.singleton;

/**
 * Author: ocean
 * Date: 4/4/23 7:30 PM
 */

public enum SingletonEnum {
    INSTANCE("Singleton enum class");
    private String description;

    private SingletonEnum(String description) {
        this.description = description;
    }

    public SingletonEnum getInstance() {
        return INSTANCE;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

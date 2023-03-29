package org.ocean.patterns.mediator;

public class User {
    public String getName() {
        return name;
    }

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void receiveMessage(String message) {
        System.out.println("User " + this.name + " received message: " + message);
    }
}

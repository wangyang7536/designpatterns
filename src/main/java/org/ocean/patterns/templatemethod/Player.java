package org.ocean.patterns.templatemethod;

/**
 * Author: ocean
 * Date: 4/1/23 8:00 PM
 */

public class Player {
    int id;
    String name;
    int val;

    public Player(int id, String name, int val) {
        this.id = id;
        this.name = name;
        this.val = val;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getVal() {
        return val;
    }
}

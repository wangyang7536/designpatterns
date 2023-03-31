package org.ocean.patterns.visitor;

/**
 * Author: ocean
 * Date: 3/31/23 12:48 AM
 */

public class Knife extends Product {

    public Knife(double price) {
        super(price);
    }

    public double getCost() {
        return getPrice() * 1.1 + 5;
    }
}

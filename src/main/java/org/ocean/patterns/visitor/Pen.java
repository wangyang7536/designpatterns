package org.ocean.patterns.visitor;

/**
 * Author: ocean
 * Date: 3/31/23 12:48 AM
 */

public class Pen extends Product{
    public Pen(double price) {
        super(price);
    }

    public double getCost() {
        return getPrice() * 0.8;
    }
}

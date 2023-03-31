package org.ocean.patterns.visitor;

/**
 * Author: ocean
 * Date: 3/31/23 12:47 AM
 */

public abstract class Product {
    private double price;
    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    abstract double getCost();
}

package org.ocean.patterns.visitor;

/**
 * Author: ocean
 * Date: 3/31/23 12:57 AM
 */

public class TotalCostVisitor implements Visitor{
    private double totalCost = 0;
    @Override
    public void visit(Product product) {
        totalCost += product.getCost();
    }

    public double getTotalCost() {
        return totalCost;
    }
}

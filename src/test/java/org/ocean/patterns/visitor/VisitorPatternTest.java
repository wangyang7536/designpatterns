package org.ocean.patterns.visitor;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Author: ocean
 * Date: 3/31/23 1:04 AM
 */

public class VisitorPatternTest {
    @Test
    public void test() {
        ShoppingCart cart = new ShoppingCart();
        Product book = new Book(10);
        Product pen = new Pen(5);
        Product knife = new Knife(15);
        cart.addProduct(book);
        cart.addProduct(pen);
        cart.addProduct(knife);
        TotalCostVisitor visitor = new TotalCostVisitor();
        cart.accept(visitor);
        assertTrue(visitor.getTotalCost() == 34.5);
    }
}

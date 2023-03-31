package org.ocean.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: ocean
 * Date: 3/31/23 12:49 AM
 */

public class ShoppingCart {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void accept(Visitor visitor) {
        for(Product product: products) {
            product.accept(visitor);
        }
    }
}

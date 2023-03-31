package org.ocean.patterns.strategy;

/**
 * Author: ocean
 * Date: 3/30/23 8:10 PM
 */

public class DebitPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Debit card payment amount=" + amount);
    }
}

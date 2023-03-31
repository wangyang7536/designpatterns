package org.ocean.patterns.strategy;

/**
 * Author: ocean
 * Date: 3/30/23 8:10 PM
 */

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paypal payment amount=" + amount);
    }
}

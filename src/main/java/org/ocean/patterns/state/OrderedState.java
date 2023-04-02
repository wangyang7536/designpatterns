package org.ocean.patterns.state;

/**
 * Author: ocean
 * Date: 4/1/23 5:33 PM
 */

public class OrderedState implements PackageState{
    static String stateName = "ORDERED";
    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("The package is just ordered.");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered yet.");
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}

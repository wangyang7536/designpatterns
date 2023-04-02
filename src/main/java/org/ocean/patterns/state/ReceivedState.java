package org.ocean.patterns.state;

/**
 * Author: ocean
 * Date: 4/1/23 5:34 PM
 */

public class ReceivedState implements PackageState{
    static String stateName = "RECEIVED";
    @Override
    public void next(Package pkg) {
        System.out.println("This package is already received.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered.");
    }
    @Override
    public String getStateName() {
        return stateName;
    }
}

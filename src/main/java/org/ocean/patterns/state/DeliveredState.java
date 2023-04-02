package org.ocean.patterns.state;

/**
 * Author: ocean
 * Date: 4/1/23 5:33 PM
 */

public class DeliveredState implements PackageState{
    static String stateName = "DELIVERED";
    @Override
    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivering.");
    }
    @Override
    public String getStateName() {
        return stateName;
    }
}

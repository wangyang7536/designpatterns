package org.ocean.patterns.state;

/**
 * Author: ocean
 * Date: 4/1/23 5:32 PM
 */

public class Package {
    String name;
    int price;
    private PackageState state;

    public Package(String name, int price) {
        this.name = name;
        this.price = price;
        this.state = new OrderedState();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public PackageState getState() {
        return this.state;
    }

    public void goToNextState() {
        state.next(this);
    }

    public void goToPrevState() {
        state.prev(this);
    }

    public void printPackageState() {
        state.printStatus();
    }

}

package org.ocean.patterns.composite;

/**
 * Author: ocean
 * Date: 3/31/23 2:57 PM
 */

public class Worker extends Employee{
    public Worker(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void addReport(Employee report) {
        // Do nothing
    }

    @Override
    public void removeReport(Employee report) {
        // Do nothing
    }
}

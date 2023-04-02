package org.ocean.patterns.composite;

import java.util.List;

/**
 * Author: ocean
 * Date: 3/31/23 2:52 PM
 */

public class Manager extends Employee{

    public Manager(String name, int salary) {
        super(name, salary);
    }

    public void addReport(Employee report) {
        reports.add(report);
    }

    @Override
    public void removeReport(Employee report) {
        reports.remove(report);
    }

    @Override
    public int getSalary() {
        int totalSalary = 0;
        for(Employee report: reports) {
            totalSalary += report.getSalary();
        }
        return totalSalary+this.salary;
    }
}

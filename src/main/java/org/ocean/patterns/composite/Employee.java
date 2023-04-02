package org.ocean.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: ocean
 * Date: 3/31/23 2:19 PM
 */

public abstract class Employee {
    String name;
    int salary;
    List<Employee> reports;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        reports = new ArrayList<>();
    }

    public abstract void addReport(Employee report);
    public abstract void removeReport(Employee report);

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }
}

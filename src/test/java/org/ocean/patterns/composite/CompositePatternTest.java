package org.ocean.patterns.composite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Author: ocean
 * Date: 3/31/23 3:00 PM
 */

public class CompositePatternTest {
    @Test
    public void test() {
        Employee seniorManager = new Manager("Ocean",300000);
        Employee worker1 = new Worker("Johan",120000);
        Employee worker2 = new Worker("Cohen",130000);
        seniorManager.addReport(worker1);
        seniorManager.addReport(worker2);
        assertEquals(seniorManager.getSalary(), 550000);
        Employee director = new Manager("John",500000);
        Employee techLead = new Worker("Nick", 250000);
        director.addReport(techLead);
        director.addReport(seniorManager);
        assertEquals(director.getSalary(), 1300000);
    }
}

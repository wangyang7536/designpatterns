package org.ocean.patterns.state;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Author: ocean
 * Date: 4/1/23 5:43 PM
 */

public class StatePatternTest {
    @Test
    public void test() {
        Package pkg = new Package("Book",10);
        assertEquals(pkg.getState().getStateName(), "ORDERED");
        pkg.goToNextState();
        assertEquals(pkg.getState().getStateName(), "DELIVERED");
        pkg.goToNextState();
        assertEquals(pkg.getState().getStateName(), "RECEIVED");
        pkg.goToPrevState();
        assertEquals(pkg.getState().getStateName(), "DELIVERED");
        pkg.goToPrevState();
        assertEquals(pkg.getState().getStateName(), "ORDERED");
    }
}

package org.ocean.patterns.statemachine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: ocean
 * Date: 4/1/23 7:44 PM
 */

public class TrafficLightTest {
    @Test
    public void test() {
        TrafficLightControl control = new TrafficLightControl();
        assertEquals(TrafficLight.GREEN, control.getCurrLight());
        control.changeLight();
        assertEquals(TrafficLight.YELLOW, control.getCurrLight());
        control.changeLight();
        assertEquals(TrafficLight.RED, control.getCurrLight());
        control.changeLight();
        assertEquals(TrafficLight.GREEN, control.getCurrLight());
    }
}

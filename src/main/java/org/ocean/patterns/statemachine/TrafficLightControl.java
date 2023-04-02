package org.ocean.patterns.statemachine;

/**
 * Author: ocean
 * Date: 4/1/23 6:19 PM
 */

public class TrafficLightControl {
    private TrafficLight currLight;

    public TrafficLightControl() {
        this.currLight = TrafficLight.GREEN;
    }

    public void changeLight() {
        switch (currLight) {
            case GREEN:
                currLight = TrafficLight.YELLOW;
                break;
            case YELLOW:
                currLight = TrafficLight.RED;
                break;
            case RED:
                currLight = TrafficLight.GREEN;
                break;
        }
    }

    public TrafficLight getCurrLight() {
        return currLight;
    }
}

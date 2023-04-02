package org.ocean.patterns.state;

/**
 * Author: ocean
 * Date: 4/1/23 5:32 PM
 */

public interface PackageState {
    void next(Package pkg);

    void prev(Package pkg);

    void printStatus();

    String getStateName();
}

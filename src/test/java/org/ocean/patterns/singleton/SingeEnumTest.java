package org.ocean.patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: ocean
 * Date: 4/4/23 7:32 PM
 */

public class SingeEnumTest {
    @Test
    public void test() {
        SingletonEnum singleton = SingletonEnum.INSTANCE.getInstance();
        assertEquals(singleton.getDescription(), "Singleton enum class");
        singleton.setDescription("Change singleton enum description");
        SingletonEnum anotherSingleton = SingletonEnum.INSTANCE.getInstance();
        assertEquals(anotherSingleton.getDescription(), "Change singleton enum description");
        assertEquals(singleton.getDescription(), "Change singleton enum description");
    }
}

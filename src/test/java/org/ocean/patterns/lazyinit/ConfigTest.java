package org.ocean.patterns.lazyinit;

import org.junit.Test;
import org.ocean.patterns.lazyinitialization.ConfigSetting;

import static org.junit.Assert.assertEquals;

/**
 * Author: ocean
 * Date: 3/30/23 3:00 PM
 */

public class ConfigTest {
    @Test
    public void test() {
        ConfigSetting config = new ConfigSetting();
        assertEquals(config.getConfig("salary"), 600000.0);
    }
}

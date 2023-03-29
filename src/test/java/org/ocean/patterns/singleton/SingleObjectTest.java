package org.ocean.patterns.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleObjectTest {
    @Test
    public void test() {
        assertEquals(SingleObject.getInstance().getType(), "Singleton");
    }
}

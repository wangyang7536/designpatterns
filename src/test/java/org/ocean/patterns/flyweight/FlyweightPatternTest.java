package org.ocean.patterns.flyweight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: ocean
 * Date: 4/3/23 10:41 PM
 */

public class FlyweightPatternTest {
    @Test
    public void test() {
        Game g1 = GameFactory.getGame(GameType.COMPARE);
        Game g2 = GameFactory.getGame(GameType.COMPARE);
        assertEquals(g1, g2);
        Game g3 = GameFactory.getGame(GameType.JUMP);
        Game g4 = GameFactory.getGame(GameType.JUMP);
        assertEquals(g3, g4);
    }

}

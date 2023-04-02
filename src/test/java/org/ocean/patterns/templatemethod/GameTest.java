package org.ocean.patterns.templatemethod;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Author: ocean
 * Date: 4/1/23 8:07 PM
 */

public class GameTest {
    @Test
    public void test() {
        Player p1 = new Player(1, "Ocean", 10);
        Player p2 = new Player(2, "Nick", 5);
        Game g1 = new CompareGame(p1, p2);
        GameResult result = g1.play();
        assertEquals(result, GameResult.WIN);
    }
}

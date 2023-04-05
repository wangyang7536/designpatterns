package org.ocean.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: ocean
 * Date: 4/3/23 10:19 PM
 */

public class GameFactory {
    private GameFactory() {
    }

    private static Map<GameType, Game> gameCache = new HashMap<>();

    public static Game getGame(GameType gameType) {
        Game game = gameCache.computeIfAbsent(gameType, element -> {
            Session session = new Session();
            if (gameType.equals(GameType.COMPARE))
                return new CompareGame(session);
            return new JumpGame(session);
        });

        return game;
    }
}

package org.ocean.patterns.templatemethod;

/**
 * Author: ocean
 * Date: 4/1/23 8:04 PM
 */

public class CompareGame extends Game {
    public CompareGame(Player p1, Player p2) {
        super(p1, p2);
    }

    @Override
    void initialize(Player p1, Player p2) {
        System.out.println("Initializing compare game for player=" + p1.getName() + " and player=" + p2.getName());
    }

    @Override
    void startPlay(Player p1, Player p2) {
        System.out.println("Start compare game for player=" + p1.getName() + " and player=" + p2.getName());
    }

    @Override
    GameResult endPlay(Player p1, Player p2) {
        System.out.println("Completing compare game for player=" + p1.getName() + " and player=" + p2.getName());
        if (p1.getVal() > p2.getVal()) {
            return GameResult.WIN;
        } else if (p1.getVal() < p2.getVal()) {
            return GameResult.LOSS;
        } else {
            return GameResult.DRAW;
        }
    }
}

package org.ocean.patterns.templatemethod;

/**
 * Author: ocean
 * Date: 4/1/23 7:56 PM
 */

public abstract class Game {
    Player p1;
    Player p2;

    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    abstract void initialize(Player p1, Player p2);

    abstract void startPlay(Player p1, Player p2);

    abstract GameResult endPlay(Player p1, Player p2);

    public final GameResult play() {
        initialize(p1, p2);
        startPlay(p1, p2);
        return endPlay(p1, p2);
    }
}

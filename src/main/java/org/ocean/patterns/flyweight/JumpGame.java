package org.ocean.patterns.flyweight;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Author: ocean
 * Date: 4/3/23 10:09 PM
 */

public class JumpGame implements Game {
    private final static Logger LOG = LoggerFactory.getLogger(JumpGame.class);
    int playerLimit = 5;

    Session session;

    public JumpGame(Session session) {
        this.session = session;
        try {
            LOG.debug("Debug log for creating JUMP game");
            LOG.info("The operation of creating JUMP game is time costing");
            LOG.error("Error log for creating JUMP game");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            LOG.error("Error while creating JUMP game", e);
        }
    }

    @Override
    public void start() {
        System.out.println("Starting jump game");
    }

    @Override
    public void end() {
        System.out.println("Ending jump game");
    }

    @Override
    public int getPlayerLimit() {
        return playerLimit;
    }
}

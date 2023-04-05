package org.ocean.patterns.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author: ocean
 * Date: 4/3/23 10:08 PM
 */

public class CompareGame implements Game{
    private final static Logger LOG = LoggerFactory.getLogger(CompareGame.class);
    int playerLimit = 2;

    Session session;
    public CompareGame(Session session) {
        this.session = session;
        try {
            LOG.debug("Debug log for creating COMPARE game");
            LOG.info("The operation of creating COMPARE game is time costing");
            LOG.error("Error log for creating COMPARE game");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            LOG.error("Error while creating COMPARE game", e);
        }
    }
    @Override
    public void start() {
        System.out.println("Starting compare game");
    }

    @Override
    public void end() {
        System.out.println("Ending compare game");
    }

    @Override
    public int getPlayerLimit() {
        return playerLimit;
    }
}

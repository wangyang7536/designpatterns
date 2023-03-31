package org.ocean.patterns.proxy;

/**
 * Author: ocean
 * Date: 3/30/23 2:00 PM
 */

public class RemoteServiceImpl implements RemoteService {
    @Override
    public String getData() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Data from remote service";
    }
}

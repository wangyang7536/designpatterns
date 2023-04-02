package org.ocean.patterns.adapter;

/**
 * Author: ocean
 * Date: 3/31/23 4:01 PM
 */

public class LegacyDatabaseImpl implements LegacyDatabase{
    @Override
    public void legacySave(String data) {
        System.out.println("Saving data=" + data + " in legacy DB");
    }
}

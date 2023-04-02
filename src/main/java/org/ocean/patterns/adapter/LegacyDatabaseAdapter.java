package org.ocean.patterns.adapter;

/**
 * Author: ocean
 * Date: 3/31/23 4:02 PM
 */

public class LegacyDatabaseAdapter implements JpaDatabase {
    private LegacyDatabase legacyDatabase;

    public LegacyDatabaseAdapter(LegacyDatabase legacyDatabase) {
        this.legacyDatabase = legacyDatabase;
    }

    @Override
    public void jpaSave(Object data) {
        String legacyData = convertToLegacyFormat(data);
        legacyDatabase.legacySave(legacyData);
    }

    private String convertToLegacyFormat(Object data) {
        return data.toString();
    }

}

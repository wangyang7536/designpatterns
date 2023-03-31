package org.ocean.patterns.lazyinitialization;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

/**
 * Author: ocean
 * Date: 3/30/23 2:49 PM
 */

public class ConfigSetting {
    private Map<String, Object> configs;
    private String configFilePath = "/Users/ocean/Workspace/design_patterns/DesignPatterns/src/test/resources" +
            "/LazyInitialization/mock_configs.json";

    public ConfigSetting() {
        if (configs == null) {
            try {
                loadConfigs();
                System.out.println("Initializing configurations during startup");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void loadConfigs() throws IOException {
        Gson gson = new Gson();
        String jsonStr = readFileAsString();
        configs = gson.fromJson(jsonStr, Map.class);
    }

    public String readFileAsString() throws IOException {
        return new String(Files.readAllBytes(Paths.get(configFilePath)));
    }

    public Object getConfig(String name) {
        return configs.get(name);
    }
}

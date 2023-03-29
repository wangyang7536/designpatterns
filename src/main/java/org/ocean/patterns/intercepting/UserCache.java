package org.ocean.patterns.intercepting;

import java.util.HashMap;
import java.util.Map;

public class UserCache {
    static Map<String, String> map = new HashMap<>();

    public static void addUser(String userId, String name) {
        map.putIfAbsent(userId, name);
    }

    public static boolean hasUser(String userId) {
        return map.containsKey(userId);
    }

    public static String getUser(String userId) {
        return map.get(userId);
    }
}

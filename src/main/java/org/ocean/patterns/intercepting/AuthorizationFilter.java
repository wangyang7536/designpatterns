package org.ocean.patterns.intercepting;

import java.util.Random;

public class AuthorizationFilter implements Filter{
    Random random;
    public AuthorizationFilter() {
        random = new Random();
    }
    @Override
    public void handle(Request request) {
        int token = random.nextInt(100);
        request.setToken(token + "");
    }
}

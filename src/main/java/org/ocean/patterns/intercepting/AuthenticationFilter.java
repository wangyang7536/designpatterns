package org.ocean.patterns.intercepting;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationFilter implements Filter {

    @Override
    public void handle(Request request) throws FilterException {
        String userId = request.getUserId();
        if (!UserCache.hasUser(userId)) {
            throw new FilterException("User id doesn't exist, failing request");
        }
        request.setPreProcessingMessage("Current request with id=" + userId + " is valid");
    }
}

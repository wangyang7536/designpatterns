package org.ocean.patterns.intercepting;

public class LoggingFilter implements Filter{
    @Override
    public void handle(Request request) {
        request.setPostProcessingMessage("Request with id=" + request.getUserId() + " has been executed");
    }
}

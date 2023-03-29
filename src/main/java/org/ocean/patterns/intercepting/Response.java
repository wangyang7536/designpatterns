package org.ocean.patterns.intercepting;

public class Response {
    String userId;
    int alteredValue;

    public Response(String userId, int value) {
        this.userId = userId;
        this.alteredValue = value * 2 + 10;
    }

    public String getUserId() {
        return this.userId;
    }

    public int getAlteredValue() {
        return this.alteredValue;
    }
}

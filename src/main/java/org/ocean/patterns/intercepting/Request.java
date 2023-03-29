package org.ocean.patterns.intercepting;

public class Request {
    String userId;
    String token;
    boolean isEncrypted = false;
    String preProcessingMessage;
    String postProcessingMessage;

    int value;

    public Request(String userId, int value) {
        this.userId = userId;
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isEncrypted() {
        return isEncrypted;
    }

    public void setEncrypted(boolean encrypted) {
        isEncrypted = encrypted;
    }

    public String getPreProcessingMessage() {
        return preProcessingMessage;
    }

    public void setPreProcessingMessage(String preProcessingMessage) {
        this.preProcessingMessage = preProcessingMessage;
    }

    public String getPostProcessingMessage() {
        return postProcessingMessage;
    }

    public void setPostProcessingMessage(String postProcessingMessage) {
        this.postProcessingMessage = postProcessingMessage;
    }

}

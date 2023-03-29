package org.ocean.patterns.intercepting;

public class EncryptionFilter implements Filter {

    @Override
    public void handle(Request request) {
        request.setEncrypted(true);
    }
}

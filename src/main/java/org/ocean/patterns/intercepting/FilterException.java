package org.ocean.patterns.intercepting;

public class FilterException extends Exception {
    public FilterException(String message) {
        super(message);
    }

    public FilterException(String message, Throwable cause) {
        super(message, cause);
    }
}

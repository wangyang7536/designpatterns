package org.ocean.patterns.intercepting;

public interface Filter {
    public void handle(Request request) throws FilterException;
}

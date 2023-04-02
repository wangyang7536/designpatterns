package org.ocean.patterns.memento;

/**
 * Author: ocean
 * Date: 4/1/23 8:13 PM
 */

public class Memento {
    private String content;
    public Memento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

package org.ocean.patterns.memento;

import org.apache.commons.lang3.StringUtils;

/**
 * Author: ocean
 * Date: 4/1/23 8:10 PM
 */

public class Editor {
    private String content;
    public Editor() {
        content = StringUtils.EMPTY;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Memento save() {
        return new Memento(content);
    }

    public void restore(Memento memento) {
        this.content = memento.getContent();
    }
}

package org.ocean.patterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: ocean
 * Date: 4/1/23 8:14 PM
 */

public class History {
    private List<Memento> mementos = new ArrayList<>();
    public void add(Memento memento) {
        mementos.add(memento);
    }
    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}

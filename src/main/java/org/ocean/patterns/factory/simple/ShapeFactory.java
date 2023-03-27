package org.ocean.patterns.factory.simple;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String type) {
        Shape shape = shapes.get(type);
        if (shape == null) {
            if (type.equalsIgnoreCase("rectangle")) {
                shape = new Rectangle();
            } else if (type.equalsIgnoreCase("circle")) {
                shape = new Circle();
            } else if (type.equalsIgnoreCase("square")) {
                shape = new Square();
            }
            shapes.put(type, shape);
        }
        return shape;
    }
}

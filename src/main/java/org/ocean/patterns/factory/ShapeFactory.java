package org.ocean.patterns.factory;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String shapeType) {
        Shape shape = shapes.get(shapeType);
        if (shape == null) {
            if (shapeType.equalsIgnoreCase("rectangle")) {
                shape = new Rectangle();
            } else if (shapeType.equalsIgnoreCase("circle")) {
                shape = new Circle();
            } else if (shapeType.equalsIgnoreCase("square")) {
                shape = new Square();
            }
            shapes.put(shapeType, shape);
        }
        return shape;
    }
}

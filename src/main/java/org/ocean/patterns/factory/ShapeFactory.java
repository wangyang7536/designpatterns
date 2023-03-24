package org.ocean.patterns.factory;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType == null)
            return null;
        if(shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}

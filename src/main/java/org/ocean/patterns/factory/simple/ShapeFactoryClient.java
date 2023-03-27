package org.ocean.patterns.factory.simple;

public class ShapeFactoryClient {
    ShapeFactory shapeFactory;

    public ShapeFactoryClient(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public Shape createShape(String type) {
        Shape shape = shapeFactory.getShape(type);
        shape.draw();
        return shape;
    }
}

package org.ocean.patterns.factory.regular;

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

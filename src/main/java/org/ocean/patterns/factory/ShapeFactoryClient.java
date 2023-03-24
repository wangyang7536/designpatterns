package org.ocean.patterns.factory;

public class ShapeFactoryClient {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("Circle");
        Shape rect = factory.getShape("rectangle");
        Shape square = factory.getShape("square");
        circle.draw();
        rect.draw();
        square.draw();
    }
}

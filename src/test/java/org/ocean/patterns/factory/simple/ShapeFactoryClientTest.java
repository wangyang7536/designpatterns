package org.ocean.patterns.factory.simple;

import org.junit.Test;

public class ShapeFactoryClientTest {
    @Test
    public void testShape() {
        ShapeFactory shapeFactory = new ShapeFactory();
        ShapeFactoryClient shapeFactoryClient = new ShapeFactoryClient(shapeFactory);
        Shape shape = shapeFactoryClient.createShape("rectangle");
    }
}

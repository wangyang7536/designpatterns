package org.ocean.patterns.factory.abs;

import org.junit.Test;

public class AbstractFactoryPatternTest {
    @Test
    public void testShape() {
        AbstractShapeFactory roundShapeFactory = ShapeFactoryProducer.getShapeFactory(FactoryType.ROUND);
        AbstractShapeFactory polygonShapeFactory = ShapeFactoryProducer.getShapeFactory(FactoryType.POLYGON);
        Shape circle = roundShapeFactory.getShape("Circle");
        circle.draw();
        Shape ellipse = roundShapeFactory.getShape("Ellipse");
        ellipse.draw();
        Shape rectangle = polygonShapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape triangle = polygonShapeFactory.getShape("Triangle");
        triangle.draw();
    }
}

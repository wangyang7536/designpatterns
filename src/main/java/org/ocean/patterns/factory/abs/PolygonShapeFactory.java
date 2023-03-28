package org.ocean.patterns.factory.abs;

public class PolygonShapeFactory extends AbstractShapeFactory{
    public Shape getShape(String type){
        if(type.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if(type.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        }
        return null;
    }
}

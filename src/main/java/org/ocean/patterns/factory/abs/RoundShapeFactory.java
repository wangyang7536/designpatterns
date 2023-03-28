package org.ocean.patterns.factory.abs;

public class RoundShapeFactory extends AbstractShapeFactory{
    public Shape getShape(String type){
        if(type.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if(type.equalsIgnoreCase("Ellipse")) {
            return new Ellipse();
        }
        return null;
    }
}

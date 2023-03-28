package org.ocean.patterns.factory.abs;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactoryProducer {
    private static final Map<FactoryType, AbstractShapeFactory> factoryMap = new HashMap<>();

    public static AbstractShapeFactory getShapeFactory(FactoryType type) {
        if (factoryMap.containsKey(type))
            return factoryMap.get(type);
        return null;
    }

    static {
        for (FactoryType type : FactoryType.values()) {
            switch (type) {
                case POLYGON:
                    factoryMap.putIfAbsent(FactoryType.POLYGON, new PolygonShapeFactory());
                    break;
                case ROUND:
                    factoryMap.putIfAbsent(FactoryType.ROUND, new RoundShapeFactory());
                    break;
            }
        }
    }
}

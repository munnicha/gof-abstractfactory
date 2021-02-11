package com.munnicha.patterns.gof.creational.abstractfactory;

import com.munnicha.patterns.gof.creational.abstractfactory.model.Shape;

/**
 *
 * @author munnicha
 */
public abstract class AbstractShapeFactory {
    
    public abstract Shape getShapeByType(String shapeType);
    
}

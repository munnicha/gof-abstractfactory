package com.munnicha.patterns.gof.creational.abstractfactory;

import com.munnicha.patterns.gof.creational.abstractfactory.model.Rectangle;
import com.munnicha.patterns.gof.creational.abstractfactory.model.Shape;
import com.munnicha.patterns.gof.creational.abstractfactory.model.Square;

/**
 *
 * @author munnicha
 */
public class ShapeFactory extends AbstractShapeFactory{

    @Override
    public Shape getShapeByType(String shapeType) {
        if("square".equalsIgnoreCase(shapeType)){
            return new Square();
        }else if("rectangle".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }else{
            throw new IllegalArgumentException("No such shape.");
        }
    }
    
}

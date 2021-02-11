package com.munnicha.patterns.gof.creational.abstractfactory;

import com.munnicha.patterns.gof.creational.abstractfactory.model.RoundedRectangle;
import com.munnicha.patterns.gof.creational.abstractfactory.model.RoundedSquare;
import com.munnicha.patterns.gof.creational.abstractfactory.model.Shape;

/**
 *
 * @author munnicha
 */
public class RoundedShapeFactory extends AbstractShapeFactory{

    @Override
    public Shape getShapeByType(String shapeType) {
        if("square".equalsIgnoreCase(shapeType)){
            return new RoundedSquare();
        }else if("rectangle".equalsIgnoreCase(shapeType)){
            return new RoundedRectangle();
        }else{
            throw new IllegalArgumentException("No such rounded shape.");
        }
    }
}

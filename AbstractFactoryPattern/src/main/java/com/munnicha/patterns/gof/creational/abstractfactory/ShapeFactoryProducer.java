package com.munnicha.patterns.gof.creational.abstractfactory;

/**
 *
 * @author munnicha
 */
public class ShapeFactoryProducer {
    
    public static AbstractShapeFactory getFactory(String factoryType){
        if("plain".equalsIgnoreCase(factoryType)){
            return new ShapeFactory();
        }else if("rounded".equalsIgnoreCase(factoryType)){
            return new RoundedShapeFactory();
        }else{
            throw new IllegalArgumentException("No such factory.");
        }
    }
    
}

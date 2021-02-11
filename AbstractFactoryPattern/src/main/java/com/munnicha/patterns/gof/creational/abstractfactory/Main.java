package com.munnicha.patterns.gof.creational.abstractfactory;

import com.munnicha.patterns.gof.creational.abstractfactory.model.Shape;

/**
 *
 * @author munnicha
 */
public class Main {
    
    public static void main(String[] args){
        System.out.println("Abstract Factory Pattern");
        AbstractShapeFactory sf1=ShapeFactoryProducer.getFactory("plain");
        Shape shape1 = sf1.getShapeByType("rectangle");
        shape1.draw();
        Shape shape2 = sf1.getShapeByType("square");
        shape2.draw();
        
        AbstractShapeFactory sf2=ShapeFactoryProducer.getFactory("rounded");
        Shape shape3 = sf2.getShapeByType("rectangle");
        shape3.draw();
        Shape shape4 = sf2.getShapeByType("square");
        shape4.draw();
    }
}

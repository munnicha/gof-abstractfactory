package com.munnicha.patterns.gof.creational.abstractfactory.test;

import com.munnicha.patterns.gof.creational.abstractfactory.AbstractShapeFactory;
import com.munnicha.patterns.gof.creational.abstractfactory.ShapeFactoryProducer;
import com.munnicha.patterns.gof.creational.abstractfactory.model.Rectangle;
import com.munnicha.patterns.gof.creational.abstractfactory.model.RoundedRectangle;
import com.munnicha.patterns.gof.creational.abstractfactory.model.RoundedSquare;
import com.munnicha.patterns.gof.creational.abstractfactory.model.Shape;
import com.munnicha.patterns.gof.creational.abstractfactory.model.Square;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author munnicha
 */
public class AbstractFactoryTest {
    
    @Test
    public void testAbstractFactory(){
        AbstractShapeFactory sf1=ShapeFactoryProducer.getFactory("plain");
        Shape shape1 = sf1.getShapeByType("rectangle");
        Shape shape2 = sf1.getShapeByType("square");
        
        AbstractShapeFactory sf2=ShapeFactoryProducer.getFactory("rounded");
        Shape shape3 = sf2.getShapeByType("rectangle");
        Shape shape4 = sf2.getShapeByType("square");
        
        /*
        These asserts are just for the example, we may do not want
        to check the type of the created instance
        but focus more on functionality.
        */ 
        assertTrue((shape1 instanceof Rectangle));
        assertTrue((shape2 instanceof Square));
        assertTrue((shape3 instanceof RoundedRectangle));
        assertTrue((shape4 instanceof RoundedSquare));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAbstractFactoryException(){
        AbstractShapeFactory sf1=ShapeFactoryProducer.getFactory("extreme");
    }
    
}

package com.munnicha.patterns.gof.creational.abstractfactory.model;

/**
 *
 * @author munnicha
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw rectangle.");
    }
    
}

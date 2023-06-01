package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.factory;


import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.shape.Shape;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Geometry {

    public double businessLogic() {
        Shape shape = createShape();
        shape.calculateArea();
        shape.sendArea();
        return shape.getArea();
    }

    /**
     * Subclasses will override this method in order to create specific Shape
     * objects.
     */
    public abstract Shape createShape();
}

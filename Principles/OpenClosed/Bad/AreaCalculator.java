package org.fundacionjala.coding.Ruber.Principles.OpenClosed.Bad;

public class AreaCalculator {
    public double area(Rectangle[] shapes) {
        double area = 0;
        for (Rectangle shape : shapes) {
            area += shape.width*shape.height;
        }
        return area;
    }

    public double area(Object[] shapes) {
        double area = 0;
        for (Object shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                area += rectangle.width*rectangle.height;
            } else {
                Circle circle = (Circle)shape;
                area += circle.radius * circle.radius * Math.PI;
            }
        }
        return area;
    }
}
package org.fundacionjala.coding.Ruber.Principles.OpenClosed.Good;

public class AreaCalculator {

    public double area(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.area();
        }
        return area;
    }
}

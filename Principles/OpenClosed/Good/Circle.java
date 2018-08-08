package org.fundacionjala.coding.Ruber.Principles.OpenClosed.Good;

public class Circle extends Shape{
    public double radius;


    @Override
    public double area() {
        return radius*radius*Math.PI;
    }
}

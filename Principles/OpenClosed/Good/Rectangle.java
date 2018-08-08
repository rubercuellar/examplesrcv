package org.fundacionjala.coding.Ruber.Principles.OpenClosed.Good;

public class Rectangle extends Shape{
    public double width;
    public double height;


    @Override
    public double area() {
        return width * height;
    }
}
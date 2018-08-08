package org.fundacionjala.coding.Ruber.Principles.SingleResponsability.Good;

public class Vehicle {
    public int getWheelCount() {
        return 4;
    }

    public int getMaxSpeed() {
        return 200;
    }

    @Override
    public String toString() {
        return "wheelCount=" + getWheelCount() + ", maxSpeed=" + getMaxSpeed();
    }


}
package org.fundacionjala.coding.Ruber.Patrones.Singleton;

public class Main {

    public static void main(String args[]) {
        Car newCar = Car.getInstance(1999, "Red");
        Car newCar2 = Car.getInstance(1888, "Blue");
        System.out.println(newCar2.getColor()+" "+newCar2.getModel());
    }
}

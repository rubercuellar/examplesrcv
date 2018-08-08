package org.fundacionjala.coding.Ruber.Patrones.Singleton;

public class Car {
    public int getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    private final int model;
    private final String color;
    private static Car car;

    private Car(int model, String color) {
        this.model = model;
        this.color = color;
    }

    public static Car getInstance(final int model, final String color) {
        if (car == null) {
            car = new Car(model, color);
        }
        return car;

    }
}

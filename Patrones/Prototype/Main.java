package org.fundacionjala.coding.Ruber.Patrones.Prototype;

public class Main {

    public static void main(String args[]) throws CloneNotSupportedException {
        TvPrototype tvp = new TvPrototype();
        TV tv = (TV) tvp.prototipo("Plasma");
        System.out.println(tv.getPrecio());
    }
}

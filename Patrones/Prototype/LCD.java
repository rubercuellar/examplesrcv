package org.fundacionjala.coding.Ruber.Patrones.Prototype;

public class LCD extends TV{

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    private double costoFabricacion;

    public LCD(String marca, int pulgadas, String color, double precio, double costoFabricacion) {
        super(marca, pulgadas, color, precio);

        setCostoFabricacion(costoFabricacion);
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }
}

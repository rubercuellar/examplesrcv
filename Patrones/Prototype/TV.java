package org.fundacionjala.coding.Ruber.Patrones.Prototype;

public abstract class TV implements Cloneable{

    private String marca;
    private int pulgadas;
    private String color;
    private double precio;


    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public TV(String marca, int pulgadas, String color, double precio) {
        setColor(color);
        setMarca(marca);
        setPulgadas(pulgadas);
        setPrecio(precio);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}

package org.fundacionjala.coding.Ruber.Patrones.Decorator;

public class CdPlayer extends AutoDecorator{

    public CdPlayer(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " + CD Player";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 100;
    }
}

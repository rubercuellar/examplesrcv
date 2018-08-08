package org.fundacionjala.coding.Ruber.Patrones.Decorator;

public class Mp3Player extends AutoDecorator {

    public Mp3Player(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " + MP3 Player";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 250;
    }
}

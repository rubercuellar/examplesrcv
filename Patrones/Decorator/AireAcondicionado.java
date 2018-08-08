package org.fundacionjala.coding.Ruber.Patrones.Decorator;

public class AireAcondicionado extends AutoDecorator {
    public AireAcondicionado(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " +  Aire Acondicionado";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 1500;
    }
}

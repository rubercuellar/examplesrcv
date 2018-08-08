package org.fundacionjala.coding.Ruber.Patrones.Factory;

public class FacturaIva extends Factura {

    @Override
    public double getImporteIva() {
        return getImporte()*1.30;
    }
}

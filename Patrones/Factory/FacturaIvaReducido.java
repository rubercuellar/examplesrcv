package org.fundacionjala.coding.Ruber.Patrones.Factory;

public class FacturaIvaReducido extends Factura {
    @Override
    public double getImporteIva() {
        return getImporte() * 1.05;
    }
}

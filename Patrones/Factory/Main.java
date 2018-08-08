package org.fundacionjala.coding.Ruber.Patrones.Factory;

public class Main {
    public static void main(String args[]) {
        Factura f = FactoriaFacturas.getFactura("sdfsdf");
        f.setId(123);
        f.setImporte(100);
        System.out.println(f.getImporteIva());
    }
}

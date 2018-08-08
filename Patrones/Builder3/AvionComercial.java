package org.fundacionjala.coding.Ruber.Patrones.Builder3;

public class AvionComercial extends AvionBuilder{
    public AvionComercial() {
        super.avion = new Avion();
    }
    @Override
    public void setLlantas() {
        avion.setnLlantas("8");
    }

    @Override
    public void setTipoAvion() {
        avion.setTipoAvion("B12");

    }

    @Override
    public void setCantidadPasajeros() {
        avion.setCantidadPasajeros("50");
    }
}

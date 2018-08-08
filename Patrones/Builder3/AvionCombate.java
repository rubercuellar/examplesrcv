package org.fundacionjala.coding.Ruber.Patrones.Builder3;

public class AvionCombate extends AvionBuilder {

    public AvionCombate() {
        super.avion = new Avion();
    }
    @Override
    public void setLlantas() {
        avion.setnLlantas("6");

    }

    @Override
    public void setTipoAvion() {
        avion.setTipoAvion("F14");

    }

    @Override
    public void setCantidadPasajeros() {
        avion.setCantidadPasajeros("2");

    }
}

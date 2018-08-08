package org.fundacionjala.coding.Ruber.Patrones.Builder3;

public class Shop {

    private AvionBuilder avionBuilder;

    public void setAvionBuilder(AvionBuilder avBuilder) {
        avionBuilder = avBuilder;
    }

    public Avion getAvion() {
        return avionBuilder.getAvion();
    }

    public void construirAvion() {
        avionBuilder.setCantidadPasajeros();
        avionBuilder.setLlantas();
        avionBuilder.setTipoAvion();
    }
}

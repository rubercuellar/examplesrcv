package org.fundacionjala.coding.Ruber.Patrones.Builder3;

abstract class AvionBuilder {
    protected Avion avion;

    public Avion getAvion()
    {
        return avion;
    }

    public abstract void setLlantas();
    public abstract void setTipoAvion();
    public abstract void setCantidadPasajeros();
}

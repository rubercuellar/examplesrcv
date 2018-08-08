package org.fundacionjala.coding.Ruber.Patrones.Builder3;

public class Avion {

    private String tipoAvion;
    private String nLlantas;
    private String cantidadPasajeros;

    public void setTipoAvion(String tipo) {
        this.tipoAvion = tipo;
    }

    public void setnLlantas(String numeroLlantas) {
        this.nLlantas = numeroLlantas;
    }

    public void setCantidadPasajeros(String cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public void show() {
        System.out.format(" %s, %s, %s", tipoAvion, nLlantas, cantidadPasajeros);
    }
}

package org.fundacionjala.coding.Ruber.Patrones.Builder;

public class Pizza {

    private String masa = "";
    private String salsa = "";
    private String relleno = "";

    public void setMasa(String masa) {
        this.masa = masa;
    }
    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }
    public String getMasa() {
        return this.masa;
    }
}

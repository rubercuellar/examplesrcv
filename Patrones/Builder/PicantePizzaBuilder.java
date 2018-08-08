package org.fundacionjala.coding.Ruber.Patrones.Builder;

public class PicantePizzaBuilder extends PizzaBuilder {

    public PicantePizzaBuilder() {
        super.pizza = new Pizza();
    }
    @Override
    public void buildMasa() {
        pizza.setMasa("Cocido");

    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("picante");

    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("pimienta + salchichon");

    }
}

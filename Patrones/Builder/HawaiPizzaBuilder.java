package org.fundacionjala.coding.Ruber.Patrones.Builder;

public class HawaiPizzaBuilder extends PizzaBuilder {

    public HawaiPizzaBuilder() {
        super.pizza = new Pizza();
    }
    @Override
    public void buildMasa() {
        pizza.setMasa("suave");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("dulce");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("chorizo+alcachofas");
    }
}

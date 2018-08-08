package org.fundacionjala.coding.Ruber.Patrones.Builder;

public class Main {

    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        PizzaBuilder hawaiPizzaBuilder = new HawaiPizzaBuilder();
        PizzaBuilder picantePizzaBuilder = new PicantePizzaBuilder();

        cocina.setPizzaBuilder(hawaiPizzaBuilder);
        cocina.construirPizza();

        Pizza pizza = cocina.getPizza();
        System.out.println(pizza.getMasa());
    }
}

package org.fundacionjala.coding.Ruber.Patrones.Builder3;

public class Main {

    public static void main(String args[])
    {
        Shop shop = new Shop();
        AvionBuilder avionCombate = new AvionCombate();
        AvionBuilder avionComercial = new AvionComercial();

        shop.setAvionBuilder(avionCombate);
        shop.construirAvion();


        Avion avion = shop.getAvion();
        avion.show();
        System.out.println("");
        shop.setAvionBuilder(avionComercial);
        shop.construirAvion();
        Avion avion2 = shop.getAvion();
        avion2.show();


    }
}

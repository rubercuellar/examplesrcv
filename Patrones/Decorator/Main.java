package org.fundacionjala.coding.Ruber.Patrones.Decorator;

public class Main {
    public static void main(String[] args)
    {
        Vendible auto = new FiatUno();
        auto = new CdPlayer(auto);
        auto = new Gasoil(auto);

        System.out.println(auto.getDescripcion());
        System.out.println(auto.getPrecio());

        Vendible auto2 = new FordFiesta();
        auto2 = new Mp3Player(auto);
        auto2 = new Gasoil(auto2);
        auto2 = new AireAcondicionado(auto2);

        System.out.println(auto2.getDescripcion());
        System.out.println(auto2.getPrecio());
    }
}

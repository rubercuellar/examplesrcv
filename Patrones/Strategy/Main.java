package org.fundacionjala.coding.Ruber.Patrones.Strategy;

public class Main {

    public static void main(String [] args) {
        //Socio socio = new Socio();
        Alumno socio = new Alumno();
        Libro libro = new LibroFinder().findLibro(socio, "Perlas");
        System.out.println(libro.getEstado());
    }
}

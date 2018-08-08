package org.fundacionjala.coding.Ruber.Patrones.Strategy;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Biblioteca {
    public static ArrayList<Libro> libros = new ArrayList<Libro>();

    public Biblioteca() {
        Libro libro = new Libro();
        libro.setEstado("Bueno");
        libro.setTitulo("Un Titulo");
        libros.add(libro);
    }

    public static ArrayList<Libro> getLibros() {
        return libros;
    }
}

package org.fundacionjala.coding.Ruber.Patrones.Strategy;

import java.util.ArrayList;

public class BuenoNuevoRegularStrategy implements LibroStrategy {

    @Override
    public Libro findLibro(String titulo) {
        ArrayList<Libro> libros = Biblioteca.getLibros();
        Libro libro = new Libro();
        libro.setEstado("Bueno");
        return libro;
    }
}

package org.fundacionjala.coding.Ruber.Patrones.Strategy;

public class LibroFinder {

    public Libro findLibro(Persona persona, String titulo) {
        LibroStrategy strategy = null;
        if(persona instanceof Socio) {
            strategy = new NuevoBuenoRegularStrategy();
        } else if(persona instanceof Profesor) {
            strategy = new BuenoNuevoRegularStrategy();
        } else {
            strategy = new RegularBuenoNuevoStrategy();
        }
        return strategy.findLibro(titulo);
    }
}

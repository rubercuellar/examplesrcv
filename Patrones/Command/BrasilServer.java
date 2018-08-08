package org.fundacionjala.coding.Ruber.Patrones.Command;

public class BrasilServer implements IServer {
    @Override
    public void apagate() {
        System.out.println("Apagate Brasil");
    }

    @Override
    public void prendete() {
        System.out.println("Prendete Brasil");

    }

    @Override
    public void conectate() {
        System.out.println("Conectate Brasil");

    }

    @Override
    public void verificaConexion() {
        System.out.println("Verificar conexion Brasil");

    }

    @Override
    public void guardarLog() {
        System.out.println("Guardar log Brasil");

    }

    @Override
    public void cerraConexion() {
        System.out.println("Cerrar conexion Brasil");

    }
}

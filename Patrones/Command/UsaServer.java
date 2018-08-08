package org.fundacionjala.coding.Ruber.Patrones.Command;

public class UsaServer implements IServer {
    @Override
    public void apagate() {
        System.out.println("Apagate Usa");
    }

    @Override
    public void prendete() {
        System.out.println("Prendete Usa");

    }

    @Override
    public void conectate() {
        System.out.println("Conectate Usa");

    }

    @Override
    public void verificaConexion() {
        System.out.println("Verificar conexion Usa");

    }

    @Override
    public void guardarLog() {
        System.out.println("guardar log Usa");

    }

    @Override
    public void cerraConexion() {
        System.out.println("Cerrar conexxion usa");

    }
}

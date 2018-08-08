package org.fundacionjala.coding.Ruber.Patrones.Command;

public class ArgentinaServer implements IServer {
    @Override
    public void apagate() {
        System.out.println("Apagando servidor Argentina");
    }

    @Override
    public void prendete() {
        System.out.println("Prendiendo Argentina");

    }

    @Override
    public void conectate() {
        System.out.println("Conectate Argentina");

    }

    @Override
    public void verificaConexion() {
        System.out.println("Verificar Conexion Argentina");

    }

    @Override
    public void guardarLog() {
        System.out.println("guardar log Argentina");

    }

    @Override
    public void cerraConexion() {
        System.out.println("Cerrar conexion Argentina");

    }
}

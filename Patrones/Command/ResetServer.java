package org.fundacionjala.coding.Ruber.Patrones.Command;

public class ResetServer implements Command{
    private IServer servidor;

    public ResetServer(IServer servidor) {
        this.servidor = servidor;
    }

    @Override
    public void execute() {
        servidor.conectate();
        servidor.verificaConexion();
        servidor.guardarLog();
        servidor.apagate();
        servidor.prendete();
        servidor.guardarLog();
        servidor.cerraConexion();
    }
}


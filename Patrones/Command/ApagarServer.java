package org.fundacionjala.coding.Ruber.Patrones.Command;

public class ApagarServer implements Command {
    private IServer servidor;

    public ApagarServer(IServer servidor) {
        this.servidor = servidor;
    }

    @Override
    public void execute() {
        servidor.conectate();
        servidor.verificaConexion();
        servidor.guardarLog();
        servidor.apagate();
        servidor.cerraConexion();
    }
}

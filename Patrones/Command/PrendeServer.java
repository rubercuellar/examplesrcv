package org.fundacionjala.coding.Ruber.Patrones.Command;

public class PrendeServer implements Command {
    private IServer servidor;

    public PrendeServer(IServer servidor) {
        this.servidor = servidor;
    }


    @Override
    public void execute() {
        servidor.conectate();
        servidor.verificaConexion();
        servidor.prendete();
        servidor.guardarLog();
        servidor.cerraConexion();
    }
}

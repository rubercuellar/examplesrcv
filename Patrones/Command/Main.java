package org.fundacionjala.coding.Ruber.Patrones.Command;

public class Main {


    public static void main(String [] args) {
        Command command = new ApagarServer(new BrasilServer());
        Invoker serverADmin = new Invoker(command);
        serverADmin.run();
    }






}

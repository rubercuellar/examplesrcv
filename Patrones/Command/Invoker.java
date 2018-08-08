package org.fundacionjala.coding.Ruber.Patrones.Command;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }
}

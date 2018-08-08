package org.fundacionjala.coding.Ruber.Principles.DependencyInversion.Good;

public class Server implements Persistence {
    @Override
    public void save(Shopping shopping) {
        System.out.println("Saving in Server");
    }
}

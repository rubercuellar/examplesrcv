package org.fundacionjala.coding.Ruber.Principles.DependencyInversion.Good;

public class SqlDatabase implements Persistence {

    @Override
    public void save(Shopping shopping) {
        System.out.println("Saving in DB");

    }
}

package org.fundacionjala.coding.Ruber.Principles.DependencyInversion.Bad;

public class SqlDatabase {
    public void save(Shopping shopping) {
        System.out.println("Saving...");
    }
}

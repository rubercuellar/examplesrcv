package org.fundacionjala.coding.Ruber.Principles.DependencyInversion.Bad;

public class CreditCard {
    public void pay(Shopping shopping) {
        System.out.println("Paying");
    }
}

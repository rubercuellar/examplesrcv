package org.fundacionjala.coding.Ruber.Principles.DependencyInversion.Good;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(Shopping shopping) {
        System.out.println("Paying....");
    }
}

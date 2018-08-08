package org.fundacionjala.coding.Ruber.Principles.DependencyInversion.Good;

public class ShoppingBasket {

    private final Persistence persistence;
    private final PaymentMethod paymentMethod;

    public ShoppingBasket(Persistence persistence, PaymentMethod paymentMethod) {
        this.persistence = persistence;
        this.paymentMethod = paymentMethod;
    }

    public void buy(Shopping shopping) {
        persistence.save(shopping);
        paymentMethod.pay(shopping);
    }

}

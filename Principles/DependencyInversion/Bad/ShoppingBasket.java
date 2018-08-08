package org.fundacionjala.coding.Ruber.Principles.DependencyInversion.Bad;

public class ShoppingBasket {

    public void buy(Shopping shopping) {
        SqlDatabase db = new SqlDatabase();
        db.save(shopping);

        CreditCard creditCard = new CreditCard();
        creditCard.pay(shopping);
    }
}

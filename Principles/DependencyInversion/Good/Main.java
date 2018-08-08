package org.fundacionjala.coding.Ruber.Principles.DependencyInversion.Good;

public class Main {

    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        //Server server = new Server();
        SqlDatabase server = new SqlDatabase();

        Shopping shop = new Shopping();

        ShoppingBasket shoppingBasket = new ShoppingBasket(server, payPal);
        shoppingBasket.buy(shop);
    }
}

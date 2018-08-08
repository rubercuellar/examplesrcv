package org.fundacionjala.coding.Ruber.Patrones.ConstructorTelescopico;

public class User {
    private String username;
    private String password;
    private String email;
    private String name;

    public User(Builder builder) {
        username = builder.username;
        password = builder.password;
        email = builder.email;
        name = builder.name;
    }
    public void show() {
        System.out.format("%s, %s, %s, %s", this.username, this.password,
                this.name, this.email);
    }

    public static class Builder {
        private final String username;
        private final String password;

        private String email = "";
        private String name = "";

        public Builder(String username, String password)
        {
            this.username = username;
            this.password = password;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public User build() {
            return new User(this);
        }






    }

    public static void main(String args[])
    {
        User user = new Builder("rcuellar", "rcuellar").email("ruber.cuellar@hotmail.com").build();
        user.show();
        User user2 = new Builder("rolo", "rolo").build();
        user2.show();


    }




}

package org.fundacionjala.coding.Ruber.Patrones.Prototype3;

public class TestPrototypePattern {

    public static void main(String[] args) {
        AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");

        User user = new User("User A", "USER Level", userAccessControl);

        System.out.println(user.getUsername());

        userAccessControl = AccessControlProvider.getAccessControlObject("USER");
        user = new User("User B", "USER Level", userAccessControl);
        System.out.println(user.getUsername());

        user.getAccessControl().setAccess("READ REPORTS");
        System.out.println(user);

        AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
        user = new User("User C", "MANAGER Level", managerAccessControl);
        System.out.println(user);

    }
}

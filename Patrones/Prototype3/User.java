package org.fundacionjala.coding.Ruber.Patrones.Prototype3;

public class User {

    private String username;
    private String level;
    private AccessControl accessControl;

    public User(String username, String level, AccessControl accessControl) {
        this.username = username;
        this.level = level;
        this.accessControl = accessControl;
    }

    @Override
    public String toString() {
        return "Name: " + username + ", Level: " + level + ", Access Control Level: " +
                accessControl.getControlLevel() + ", Access: " + accessControl.getAccess();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public AccessControl getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(AccessControl accessControl) {
        this.accessControl = accessControl;
    }
}

package org.fundacionjala.coding.Ruber.Patrones.Builder2;

abstract class VehicleBuilder {
    protected Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public abstract void buildFrame();
    public abstract void buildEngine();
    public abstract void buildWheels();
    public abstract void buildDoos();
}

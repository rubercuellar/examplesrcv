package org.fundacionjala.coding.Ruber.Patrones.Builder2;

public class Shop {
    public void Construct(VehicleBuilder vehicleBuilder) {
        vehicleBuilder.buildDoos();
        vehicleBuilder.buildEngine();
        vehicleBuilder.buildWheels();
        vehicleBuilder.buildFrame();
    }
}

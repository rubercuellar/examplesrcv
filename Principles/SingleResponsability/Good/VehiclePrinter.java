package org.fundacionjala.coding.Ruber.Principles.SingleResponsability.Good;

public class VehiclePrinter {
    public void print(Vehicle vehicle){
        System.out.println(vehicle.toString());
    }

    public static void main(String args[]) {
        Vehicle newVehicle = new Vehicle();
        VehiclePrinter veh = new VehiclePrinter();
        veh.print(newVehicle);
    }
}
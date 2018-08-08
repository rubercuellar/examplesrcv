package org.fundacionjala.coding.Ruber.Patrones.Builder2;

import java.util.HashMap;
import java.util.Map;

public class Vehicle {
    private String vehicleType;
    private Map<String,String> parts = new HashMap<String, String>();

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getKey(String key) {
        return this.parts.get(key);
    }

    public void show()
    {
        System.out.println(this.vehicleType);
        System.out.println(parts.get("frame"));
        System.out.println(parts.get("engine"));
        System.out.println(parts.get("wheels"));
        System.out.println(parts.get("doors"));
    }

}

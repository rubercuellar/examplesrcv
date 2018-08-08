package org.fundacionjala.coding.Ruber.Patrones.Prototype;

import java.util.HashMap;

public class TvPrototype {
    private HashMap<String, TV> prototipos = new HashMap<String, TV>();

    public TvPrototype() {
        Plasma plasma = new Plasma("Sony", 21, "Plateado", 399.99, 90, 0.05);
        LCD lcd = new LCD("Panasonic", 42, "Negro", 599.99, 290);

        prototipos.put("Plasma", plasma);
        prototipos.put("LCD", lcd);
    }

    public Object prototipo(String tipo) throws CloneNotSupportedException {
        return prototipos.get(tipo).clone();
    }
}

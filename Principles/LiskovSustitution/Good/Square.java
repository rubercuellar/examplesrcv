package org.fundacionjala.coding.Ruber.Principles.LiskovSustitution.Good;

public class Square implements Shape {

    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int calculareArea() {
        return size * size;
    }


}

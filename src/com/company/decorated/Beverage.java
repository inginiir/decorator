package com.company.decorated;

public abstract class Beverage {

    String description;

    public enum Size {TALL, GRANDE, VENTI };

    Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }



    public abstract double cost();
}

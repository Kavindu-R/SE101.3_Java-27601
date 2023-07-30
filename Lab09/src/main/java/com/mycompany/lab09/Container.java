package com.mycompany.lab09;

public abstract class Container {

    private double height;
    private double radius;

    public abstract double calVolume();

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }
}

package com.mycompany.lab09;

public class CylinderContainer extends Container {

    public double calVolume() {
        double volume = Math.PI * getRadius() * getRadius() * getHeight();
        return volume;
    }

}

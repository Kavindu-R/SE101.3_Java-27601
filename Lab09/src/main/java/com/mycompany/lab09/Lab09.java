package com.mycompany.lab09;

import java.text.DecimalFormat;

public class Lab09 {

    public static void main(String[] args) {
        CylinderContainer c = new CylinderContainer();
        c.setHeight(20);
        c.setRadius(7);

        DecimalFormat d = new DecimalFormat("#0.00");
        String cc = d.format(c.calVolume());

        System.out.println("Volume " + cc);
    }
}

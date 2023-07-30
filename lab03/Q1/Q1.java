package com.mycompany.q1;

public class Q1 {

    public static void main(String[] args) {
        Monster e1 = new Monster(10, "kohomba");
        Items f1 = new Items(20, "Lux");

        System.out.println("Location is " + f1.getLocation() + " Description is " + f1.getDescription());
        System.out.println("Location is " + e1.getLocation() + " Description is " + e1.getDescription());
    }
}

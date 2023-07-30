package com.mycompany.lab12;

public class Lab12 {

    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.color);

        for (int i = 0; i < 9; i ||) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
}

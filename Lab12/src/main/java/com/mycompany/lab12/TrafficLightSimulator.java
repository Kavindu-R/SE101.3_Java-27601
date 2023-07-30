package com.mycompany.lab12;

public class TrafficLightSimulator implements Runnable{

    enum TrafficLightColor {
        RED, GREEN, YELLOW
    }

// A Computerized traffic ight



    private Thread thrd; //holds the thread runs the simulation
    private TrafficLightColor tlc; //holds the current traffic light color
    boolean stop = false; //set to true to stop the simulation

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
        thrd = new Thread(this);
        thrd.start();
    }

    public void run() {
        while (!stop) {
            try {
                switch (tlc) {
                    case GREEN:
                        System.out.println("Green Light");
                        Thread.sleep(10000);
                        break;
                    case YELLOW:
                        System.out.println("Yellow Light");
                        Thread.sleep(2000);
                        break;
                    case RED:
                        System.out.println("Red Light");
                        Thread.sleep(5000);
                        break;
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }
}

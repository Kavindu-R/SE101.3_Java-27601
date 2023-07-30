package com.mycompany.lab12;

public class TrafficLightSystem {

}

class RedLightThread extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Red Light");
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class YellowLightThread extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Yellow Light");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class GreenLightThread extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Green Light");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

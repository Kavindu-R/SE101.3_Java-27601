package com.mycompany.q1;

public class Items {

    private int location;
    private String description;

    public Items(int location, String description) {

        this.location = location;
        this.description = description;
    }

    //getter method
    public int getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    //setter method
    public void setLocation(int loc) {
        this.location = loc;
    }

    public void setDescrption(String des) {
        this.description = des;
    }

    public void display() {
        System.out.println("location " + location);
        System.out.println("description " + description);
    }
}

package com.OOPs;



public class Vehicle {

    public Vehicle(){
        System.out.println("Vehicle constructor called");
    }

    public int gearNo;
    private int maxSpeed;
    protected String color;

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("The max speed is:  " + maxSpeed);
        System.out.println("The color of the vehicle is: " + color);
        System.out.println("The no of gears are: " + gearNo);

    }

}

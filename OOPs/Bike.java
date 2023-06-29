package com.OOPs;

public class Bike extends Vehicle{
    public Bike(){
        System.out.println("Bike constructor called");
    }

    private String companyName;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void print(){
        System.out.println("The company name is: "+  companyName);
        super.print();

    }

    public static void main(String[] args) {
        Vehicle v= new Bike();
//     Allowed because bike is child, each bike is a vehicle
        v.gearNo=5;
        v.color="Red+Black";
        v.setMaxSpeed(130);
        v.print();

//     v.setCompanyName("Duke"); // not allowed because the reference is of vehicle

//     only the data members and methods created in Vehicle class can be accessed
//        Bike b= new Vehicle();
//     Each vehicle is not a bike. Parent - son analogy. Each child has traits of
//        parents but the reverse in not true.
    }

}

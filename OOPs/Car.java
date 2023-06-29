package com.OOPs;


public class Car extends Vehicle{

    public Car(){
        System.out.println("Car constructor called");

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
//        Vehicle v= new Car(); // yup its possible
        Car c = new Car();
        c.setCompanyName("Scorpio");
        c.setMaxSpeed(140);
        c.gearNo=6;
        c.color="Black";
        c.print();

    }
}

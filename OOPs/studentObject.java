package com.OOPs;

public class studentObject {
    public static void main(String[] args) {
        Student s1 = new Student();     //Creating an object of student class
        s1.name = "Lucky";
        s1.age=20;
//        s1.rollNo= 5;       //coz roll no is private
//        s1.setRollNo(5);     //can't use it as it is final data member
        System.out.println(s1); // s1 stores the address of the object
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.getRollNo()); //return -1 as we have not initialised here
        System.out.println(s1.getNoOfStudents());
//        System.out.println(s1.rollNo);
    }
}

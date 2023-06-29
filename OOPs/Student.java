//We can create objects of this class in other classes as well
//We don't have to import as long as we are working in the same package
//This is how we import: (in case working in other packages)
//    import com.OOPs.Student;
//It is also non-primitive hence in Student s1= new Student(); s1 stores the address
//Access specifier:
// Default, public, private and protected.
//When we don't write anything, it is default and can be accessed by classes of the
//same package
//When public, can be accessed from anywhere after importing
//When private, can be accessed only within the class



package com.OOPs;

public class Student {

    private static int noOfStudents;
    public String name;         //public
    private final int rollNo;         //private
    int age;        //default



//    Creating constructors
    public Student(){
        rollNo=-1;
        noOfStudents++;
//      Every constructor must initialise a final variable.
     // Default constructor
    }

 //   When we crated a constructor, the default constructor vanishes and we are forced
//    to use parameterised constructor. Otherwise, we will have to manually write
//    down the default constructor as done above. Comment it and see the magic


    public Student(String name, int rollNo){    //Parameterised constructor
        this.name= name;
        this.rollNo=rollNo;
        noOfStudents++;
    }
//We can also create default constructors and add some default values a/wish.

//    public void setRollNo(int r){   //can be accessed to set roll no
//        if(r<0)
//            return;
//        rollNo=r;
//    }


    public static int getNoOfStudents(){
        return noOfStudents;
    }

    public int getRollNo(){

        return rollNo;
    }

    public static void main(String[] args) {

        Student s1= new Student("leo",2);
//        s1.name= "leo";
        System.out.println(s1.name);
        System.out.println(Student.noOfStudents);
    }


}

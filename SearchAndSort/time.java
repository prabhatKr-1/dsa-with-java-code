package com.SearchAndSort;
//System.currentTimeMillis(); --> will give us time at any instance
class time {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < 1000; i++) {

            System.out.println("Hello");
        }
        long end=System.currentTimeMillis();
        System.out.print(end-start);
        //so it took 10 miliSeconds to perform this task
    }
}
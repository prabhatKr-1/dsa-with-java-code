package com.MultiThreading;

class MyThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 500) {
            System.out.println("Inside thread 1");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 500) {
            System.out.println("Inside thread 2");
            i++;
        }
    }
}

class myThread1 implements Runnable {
    @Override
    public void run() {
        int i=0;
        while(i<500) {
            System.out.println("Thread1 running");
            i++;
        }
    }
}

class myThread2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while(i<500) {
            System.out.println("Thread2 running");
            i++;
        }
    }
}

public class thread {
    public static void main(String[] args) {
//        MyThread1 t1 = new MyThread1();
//        MyThread2 t2 = new MyThread2();
//        t1.start();
//        t2.start();
        myThread1 mt1 = new myThread1();
        myThread2 mt2 = new myThread2();
        Thread th1 = new Thread(mt1);
        Thread th2 = new Thread(mt2);
        th1.start();
        th2.start();

    }
}

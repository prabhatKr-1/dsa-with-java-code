package com.OOPs;

public class Fraction {
    private int numerator;
    private int denominator;


    public Fraction(int numerator, int denominator) throws ZeroErrorException {
        this.numerator = numerator;
        if (denominator == 0) {
            throw e;
        }
        this.denominator = denominator;
        simplify();

    }


    private void simplify() {

        int gcd = 1;
        int smaller = Math.min(numerator, denominator);  //inbuilt fn used to find min
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

//    We will use exception handling while setting the denominator
ZeroErrorException e = new ZeroErrorException();
    public void setDenominator(int denominator) throws ZeroErrorException {

        if (denominator == 0) {
            throw e;
        }
        this.denominator = denominator;
        simplify();
    }

    public void print() {
        if (denominator == 1)
            System.out.println(numerator);
        System.out.println(numerator + "/" + denominator);
    }

    public void add(Fraction f2) {

        this.numerator = (this.numerator * f2.denominator) + (f2.numerator * this.denominator);
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public void multiply(Fraction f2) {
        this.denominator = denominator * f2.denominator;
        this.numerator = numerator * f2.numerator;
        simplify();

    }

    public static Fraction add(Fraction f1, Fraction f2) throws ZeroErrorException{
        int newNumerator = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
        int newDenominator = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(newNumerator, newDenominator);
        return f3;

    }

}

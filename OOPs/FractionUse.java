package com.OOPs;

public class FractionUse {
    public static void main(String[] args) throws ZeroErrorException {
        //here we are not handling the exception, just letting the user know
        Fraction f1 = new Fraction(4, 0);
        Fraction f2 = new Fraction(20, 40);
//       f1.print();
//        f2.print();
//        f1.setNumerator(30);
//        here we are handling the exception ourselves
        try {
            f1.setDenominator(0);
        } catch (ZeroErrorException e) {
            System.out.print("Exception:: Don't enter 0 as denominator!");
        }
//        f1.print();
//        System.out.println(f1.getNumerator());
//        f1.add(f2);
//        f1.print();
//        f1.multiply(f2);
//        f1.print();
//        Fraction f3= Fraction.add(f1,f2);
//        f3.print();

    }
}

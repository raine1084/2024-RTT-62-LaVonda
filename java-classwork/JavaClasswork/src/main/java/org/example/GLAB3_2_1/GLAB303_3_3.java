package org.example.GLAB3_2_1;

import org.example.Main;

public class GLAB303_3_3 {
    public static void main(String[] args) {
        int x = 20;
        double y = 40.5;
        long p = 30;
        float q = 10.60f;
        // int z = x + y; (1) // Error; cannot convert from double to int.
        double z = x + y;
        System.out.println("Sum of two numbers: " + z);

        // long r = p - q; // (2) // Error; cannot convert from float to long.
        float r = p - q;
        System.out.println("Subtraction of two numbers: " + r);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
// Expression:
        double result = (f * b) + (i / c) - (d * s);
//Result after all the promotions are done.
        System.out.println("result = " + result);

        double d2 = 100.04;
        // explicit type casting
        long l = (long)d;
        int i2 = (int)l;
        System.out.println("Double value "+d2);
        System.out.println("Long value "+l);
        System.out.println("Int value "+i);

        byte b2;
        int z2 = 257;
        double dou = 323.142;
        System.out.println("Conversion of int to byte.");
        b = (byte) z;
        System.out.println("z2 = " + z2 + " b2 = " + b);
        System.out.println("Conversion of double to int.");

        z = (int) dou;
        System.out.println("dou = " + dou + " b2 = " + z2);
        System.out.println("Conversion of double to byte.");

        b = (byte) dou;
        System.out.println("dou = " + dou + " b2 = " + b);



    }
}

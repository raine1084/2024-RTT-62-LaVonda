package org.example;

public class Homework303_2_1 {
    public static void main(String[] args) {
        //Write a program that declares two integer variables, assigns an integer to each, and adds them together. Assign the sum to a variable. Print out the result
        int num1 = 25;
        int num2 = 10;

        int sum = num1 + num2;
        System.out.println("The sum of " + sum);

        //Write a program that declares two double variables,
        // assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.

        double d1 = 3.1d;
        double d2 = 6.7d;

        double dSum = d1 + d2;
        System.out.println(dSum);

        //Write a program that declares an integer variable and a double variable,
        // assigns numbers to each, and adds them together. Assign the sum to a variable. Print out the result

        int x = 40;
        double y = 55.7;

        double sum2 = x + y;
        System.out.println(sum2);

        //Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number. Assign the result to a variable. Print out the result.
        // Now change the larger number to a decimal. What happens? What corrections are needed?

        int v1 = 7;
        int v2 = 35;

        double div = (double)v1 / (double)v2;
        System.out.println(div);

        //Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number. Assign the result to a variable.
        // Print out the result. Now, cast the result to an integer. Print out the result again.

        double num3 = 9.5;
        double num4 = 11.9;

        double div1 = (double)num4 / (double)num3;

        int intValue = (int) div1;
        System.out.println(div1);
        System.out.println(intValue);




    }
}

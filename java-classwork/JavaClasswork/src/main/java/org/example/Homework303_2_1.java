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
        System.out.println(intValue);

        //Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y. Declare a variable q and assign y/x to it and print q.
        // Now, cast y to a double and assign it to q. Print q again.

        int x2 = 5;
        int y2 = 6;
        double q1 = y / x;
        System.out.println(div1);

        double qValue = (double) q1;
        System.out.println(qValue);

        //Write a program that declares a named constant and uses it in a calculation. Print the result.

        final int i = 1984;
        final int height = 67;
        int h2 = i + height;
        System.out.println(h2);

        //Write a program where you create three variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product. Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product, four items of the second product, and two items of the third product. Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        // Be sure to format the results to two decimal places.

        double coffee = 5.50;
        double doughnut = 3.75;
        double greenTea = 7.50;
        
        double subTotal = (coffee * 3) + (doughnut * 4) + (greenTea * 2);
        final double SALES_TAX = 0.7;
        double totalSale = subTotal + SALES_TAX;
        System.out.println(totalSale);












    }
}

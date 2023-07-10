package org.studyeasy;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = scanner.nextInt();

        if (isEven(x)) {
            System.out.println("The value is even");
        } else
            System.out.println("The value is odd");

        System.out.println("The sum of digits " + sumOfDigits(x));

    }

//        double x = 10.2%3;
//        System.out.println(x);


    public static boolean isEven(int x) {
//        if (x % 2 == 0) {
//            return true;
//        } else
//            return false;
        return (x % 2 == 0);
    }

    public static int sumOfDigits(int value) {

        int sum = 0;
        while (value != 0) {
            sum = sum + value % 10;
            value = value / 10;

        }

        return sum;
    }


}
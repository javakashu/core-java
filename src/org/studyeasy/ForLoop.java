package org.studyeasy;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println("6\n7\n8\n9\n10");

//        for (int i = 5; i >= 1; i--) {
//
//            System.out.print("Value of i :");
//            System.out.println(i);
//        }

//        int i = 10;
//        for (; ; ) {
//            System.ou.print("Value of i :");
//            System.out.println(i);
//            if (i <= 1) {
//                break;
//            }
//            i--;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else
            System.out.println(number + " is not a prime number");

    }
           static boolean isPrime ( int num){
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= num / 2; i++) {
                if ((num % i) == 0)
                    return false;
            }
            return true;
        }

    }






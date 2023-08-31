package day21;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {

        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();
//            int[] numbers = new int[5];
//        try {
//                numbers[0] = 2;
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Catch block called");
//        }finally {
//            System.out.println("Finally block called");
//        }


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");

        try {
            int age = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Exception has occurred");
        }finally {
            sc.close();
            System.out.println("Close called");
        }


//        try {
//            exceptionGenerator.ioExceptionFunc();
//        } catch (IOException | RuntimeException e) {
//            System.out.println(e.getMessage());
//        }


        }
    }


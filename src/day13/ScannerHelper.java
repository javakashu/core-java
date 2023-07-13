package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerHelper {

    public static String takeStringInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String input = " ";
        try {
            input = scanner.next();
        } catch (InputMismatchException e) {

            System.out.println("Invalid input . Please try again");
            return takeStringInput(message);
        }

        return input;
    }
    public static int takeIntegerInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        int input = 0;
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {

            System.out.println("Invalid input . Please try again");
            return takeIntegerInput(message);
        }

        return input;
    }
    public static boolean takeBooleanInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        boolean input = false;
        try {
            input = scanner.nextBoolean();
        } catch (InputMismatchException e) {

            System.out.println("Invalid input . Please try again");
            return takeBooleanInput(message);
        }

        return input;
    }
    public static float takeFloatInput(String Message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Message);
        float input = 0;
        try {
            input = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input . Please try again");
            return takeFloatInput(Message);
        }

        return input;
    }

    public static void main(String[] args) {
        String name = "akshu";
        String secondName="karki";

        String thirdname = new String("akshu");

        thirdname.concat("java");
        thirdname = thirdname.concat("python");
        System.out.println(thirdname);
        // System.out.println(thirdname);



        System.out.println(name == thirdname);
        addMoneyToAccount("akshu",50000);
    }

    public static  void addMoneyToAccount(String accountHolder,int money){

    }
}

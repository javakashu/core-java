package UserInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        int age = 0;

        while (!validInput) {
            try {
                System.out.println("What is your age?");
                age = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Something went wrong .. Please enter age again");
                sc.nextLine();

            }
        }
            System.out.println("Your age is " + age);
            sc.close();
            }


        }







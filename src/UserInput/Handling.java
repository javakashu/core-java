package UserInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Handling {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            boolean validInput = false;
            int num = 0;

            while (!validInput) {
                try {
                    System.out.print("Enter an integer: ");
                    num = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.nextLine(); // Consume the invalid input
                }
            }

            System.out.println("You entered: " + num);

            // Close the scanner when done
            scanner.close();
        }
    }



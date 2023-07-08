package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    private String firstName;

    private String lastName;

    private String address;

    private boolean isVeteran;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isVeteran() {
        return isVeteran;
    }

    public void setVeteran(boolean veteran) {
        isVeteran = veteran;
    }

    public static String takeStringInput(String Message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Message);
        String input = " ";
        try {
            input = scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input . Please try again");
            return takeStringInput(Message);
        }

        return input;
    }
}

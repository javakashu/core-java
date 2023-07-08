package day13;

import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        String continueText = "";

        do {
            Scanner scan = new Scanner(System.in);
            Scanner newScan = new Scanner(System.in);

            System.out.println("Enter your first name:");
            String name = scan.nextLine();
            person1.setFirstName(name);

          //  String firstName = Person.takeStringInput("Enter your first name:");
            String lastName = Person.takeStringInput("Enter your last name:");
            String address = Person.takeStringInput("Enter your address:");

           // System.out.print("Enter your first name:");
           // person1.setFirstName(firstName);
            person1.setLastName(lastName);
            person1.setAddress(address);

            System.out.println("Congratulations You are approved");

            System.out.print("Do you want to create result of another student? (Y/n)");
            continueText = scan.next();
        } while (continueText.equals("Y") || continueText.equals(""));


    }
}

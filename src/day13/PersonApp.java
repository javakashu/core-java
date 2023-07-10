package day13;

import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        String continueText = "";

        do {
//            System.out.println("Enter your first name:");
//            String name = scan.nextLine();
//            person1.setFirstName(name);

            String firstName = ScannerHelper.takeStringInput("Enter your first name:");
            String lastName = ScannerHelper.takeStringInput("Enter your last name:");
            String address = ScannerHelper.takeStringInput("Enter your address:");
            boolean isVeteran = ScannerHelper.takeBooleanInput("Is a veteran?");

           // System.out.print("Enter your first name:");
             person1.setFirstName(firstName);
            person1.setLastName(lastName);
            person1.setAddress(address);
            person1.setVeteran(isVeteran);

            System.out.println(person1);
           if(person1.isVeteran())
               System.out.println("Congratulations You are approved");
           else
               System.out.println("Not approved");

            continueText = ScannerHelper.takeStringInput("Do you want to create result of another student? (Y/n)");
        } while (continueText.equals("Y") || continueText.equals(""));


    }
}

package day15;

public class InheritanceAndOverridingDemo {

        public static void main(String[] args) {
            // Creating objects of Manager and Programmer classes
            Manager manager = new Manager("John Doe", 1001, 80000.0, "Human Resources");
            Programmer programmer = new Programmer("Alice Smith", 2001, 60000.0, "Java");

            // Displaying details using method overriding
            System.out.println("--- Manager Details ---");
            manager.displayDetails();

            System.out.println("\n--- Programmer Details ---");
            programmer.displayDetails();
        }
    }


package day15;

public class Programmer extends Employee {

        private String programmingLanguage;

        public Programmer(String name, int employeeId, double salary, String programmingLanguage) {
            super(name, employeeId, salary);
            this.programmingLanguage = programmingLanguage;
        }
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the parent class method to print common details
        System.out.println("Programming Language: " + programmingLanguage);
    }

    }

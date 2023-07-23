package day15;

public class Manager extends  Employee{

    private String department;

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the parent class method to print common details
        System.out.println("Department: " + department);
    }
}


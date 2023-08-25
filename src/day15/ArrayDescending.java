package day15;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDescending {

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = { 5, 2, 9, 1, 5, 6 };
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println("Sorted Integer Array (Descending): " + Arrays.toString(intArray));

        // String array
        String[] strArray = { "apple", "banana", "orange", "grapes", "pineapple" };
        System.out.println("\nOriginal String Array: " + Arrays.toString(strArray));
        Arrays.sort(strArray, Collections.reverseOrder());
        System.out.println("Sorted String Array (Descending): " + Arrays.toString(strArray));
    }

    public static class Employee {

        // Parent class: Employee

            private String name;
            private int employeeId;
            private double salary;

            public Employee(String name, int employeeId, double salary) {
                this.name = name;
                this.employeeId = employeeId;
                this.salary = salary;
            }

            public void displayDetails() {
                System.out.println("Employee Name: " + name);
                System.out.println("Employee ID: " + employeeId);
                System.out.println("Salary: $" + salary);
            }
        }
}

package day15;

import java.util.Arrays;

public class DeleteIndexButNotLast {
    public static void main(String[] args) {

            int[] array = {10, 20, 30, 40, 50};
            int indexToDelete = 2; // Index to delete (except the last index)

            System.out.println("Original Array: " + Arrays.toString(array));

            // Check if the index to delete is valid
            if (indexToDelete < 0 || indexToDelete >= array.length - 1) {
                System.out.println("Invalid index to delete. Index should be between 0 and " + (array.length - 2));
            } else {
                // Shift elements to the left to overwrite the element at the specified index
                for (int i = indexToDelete; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }

                // Set the last index to 0 or any other value as required (optional)
                array[array.length - 1] = 0;

                System.out.println("Array after deleting index " + indexToDelete + ": " + Arrays.toString(array));
            }
        }

    public static class Manager extends ArrayDescending.Employee {

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
}







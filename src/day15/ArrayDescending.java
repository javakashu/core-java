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
}

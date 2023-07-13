package ProblemSolving;

import java.util.Scanner;

public class Concat {

    // Add two string numbers without converting the whole string to any numerical datatype.

    public static String addStrings(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int carry = 0;
        StringBuilder result = new StringBuilder();

        // Traverse the strings from right to left
        for (int i = m - 1, j = n - 1; i >= 0 || j >= 0; i--, j--) {
            // Get the numerical value of the current digits
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;

            // Calculate the sum and carry
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            sum %= 10;

            // Insert the sum digit at the beginning of the result string
            result.insert(0, sum);
        }

        // If there's a remaining carry, append it to the result
        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String num1 = "126";
        String num2 = "456";
        String sum = addStrings(num1, num2);
        System.out.println("Sum: " + sum); // Output: Sum: 579
    }
}
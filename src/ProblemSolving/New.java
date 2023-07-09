package ProblemSolving;

public class New {
    public static void main(String[] args) {

            int number = 123456; // Replace with your desired positive integer

            int product = 1;
            int sum = 0;

            // Iterate through each digit of the number
            while (number > 0) {
                int digit = number % 10; // Get the last digit
                product *= digit; // Multiply the digit with the product
                sum += digit; // Add the digit to the sum
                number /= 10; // Remove the last digit
            }

            int difference = product - sum;

            System.out.println("Difference: " + difference);


        }
        public int solution(int difference) {

            return difference;
        }

    }



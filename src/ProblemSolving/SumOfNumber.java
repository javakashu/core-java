package ProblemSolving;

public class SumOfNumber {

        public static void main(String[] args) {
            int a = 532;
            int sum = calculateDigitSum(a);
            System.out.println("Sum = " + sum);
        }

        public static int calculateDigitSum(int num) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
    }


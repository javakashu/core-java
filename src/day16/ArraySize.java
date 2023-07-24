package day16;

import java.util.Arrays;

public class ArraySize {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 1;
        numbers[1] = 10;
        numbers[2] = 5;
        numbers[3] = 5;
        numbers[4] = 5;
        System.out.println(Arrays.toString(numbers));
//
//        int i = 0;
//        int[] newNumbers = new int[numbers.length + 1];
//        for (int n : numbers) {
//            System.out.println(n);
//            newNumbers[i] = n;
//            i++;
//        }
//        System.out.println(Arrays.toString(newNumbers));
//        newNumbers[5] = 7;
//        System.out.println(Arrays.toString(newNumbers));

        int[] newNumbers = Arrays.copyOf(numbers,numbers.length -1);
        System.out.println(Arrays.toString(newNumbers));



    }
}


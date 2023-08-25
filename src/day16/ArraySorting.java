package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 6;
        numbers[2] = 2;
        numbers[3] = 50;
        numbers[4] = 10;
        System.out.println(Arrays.toString(numbers));

//        int[] copyOfNumbers = numbers;


//        manipulateArray(numbers);
//        System.out.println(Arrays.toString(numbers));


        //TODO WE will learn this when we learn about interface
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


//        int a =2;
//        manipulateInteger(a);
//        System.out.println(a);


//        Student[] students = new Student[3];
//        students[0] = new Student("Akshu",3,5000);
//        students[1] = new Student("Junu",1,1000);
//        students[2] = new Student("Taman",10,10000);
//

        Comparable<Student> comparable = new Student("asd", 3, 100);

        Student[] students1 = new Student[3];

        students1[0] = new Student("Junu", 1, 20000);
        students1[1] = new Student("Taman", 10, 10000);
        students1[2] = new Student("Akshu", 3, 5000);

        System.out.println(Arrays.toString(students1));


//        System.out.println(Arrays.deepEquals(students,students1));

        Arrays.sort(students1);
        System.out.println(Arrays.toString(students1));
//        Arrays.binarySearch(students1,new Student)
//            int index = Arrays.binarySearch(numbers,3);
//        System.out.println(index);


//        public static void manipulateInteger ( int a){
//            a = 50;
//        }
//
//        public static void manipulateArray ( int[] num){
//            num[2] = 50;
//        }


    }
}

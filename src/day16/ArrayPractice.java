package day16;

import day6.Student;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int a =2;

        int [] numbers = new int[5];
        numbers[0]=1;
        numbers [4] =10;
        numbers [0]=5;

        System.out.println(Arrays.toString(numbers));

       int thirdIndexValues= numbers[3];
        System.out.println(thirdIndexValues);


        Student student = new Student();

        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));

        Student student1 = new Student();
        student1.setName("Abc");
        students[0]=student1;
        students [4] = new Student();

        System.out.println(Arrays.toString(students));




        String[] names = new String[4];
        System.out.println(Arrays.toString(names));

        int[] primeNumbers = {1,2,3,5,7,11};
        System.out.println(Arrays.toString(primeNumbers));

    }

}

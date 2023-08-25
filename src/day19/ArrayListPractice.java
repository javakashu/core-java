package day19;

import day6.Student;

import java.util.ArrayList;

public class ArrayListPractice {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        System.out.println(list);

        // ArrayList<int> students = new ArrayList<>(); ==> Primitive type is not allowed


        list.add("Taman");
        list.add("Akshu");
        list.add("Junu");
        list.add(3,"Ram");

        System.out.println(list);

        list.set(3,"Shyam");
        System.out.println(list);

       // list.remove(2);

        list.remove("Taman");

        System.out.println(list);


        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1,"Red","six","ABC"));
        students.add(new Student(2,"Green","six","ABC"));

        System.out.println(students);

        students.remove(new Student(2,"Green","six","ABC"));

        System.out.println(students);

        String result = list.get(2);

        System.out.println(result);





    }
}

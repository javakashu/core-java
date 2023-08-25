package day20;

import day16.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSorting {
    public static void main(String[] args) {


    ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Junu", 1, 20000));
        students.add(new Student("Taman", 10, 10000));
        students.add(new Student("Akshu", 3, 5000));

        Collections.sort(students);

        System.out.println(students);

        Collections.sort(students, new FeeComparator());

        System.out.println(students);

}
}

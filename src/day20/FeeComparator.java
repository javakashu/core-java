package day20;

import day16.Student;

import java.util.Comparator;

public class FeeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getFee(),o2.getFee());
    }
}

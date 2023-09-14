package day26;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class StreamCustomClass {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Taman",3,5000));
        students.add(new Student("Akshu",1,8000));
        students.add(new Student("Junu",2,2000));
        students.add(new Student("Taman",3,5000));

        System.out.println(students);

       List<Student> distinctStudentList =students.stream()

               .filter(student -> student.getFee() >= 5000)
               .distinct()
               .sorted()
                .collect(Collectors.toList());

        System.out.println(distinctStudentList);


    }
}

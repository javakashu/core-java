package ProblemSolving;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice",20));
        students.add(new Student("Bob",22));
        students.add(new Student("Carol",19));

        for(Student student:students){
            System.out.println(student.getName()+"is"+student.getAge()+"Years old.");
        }
    }
}

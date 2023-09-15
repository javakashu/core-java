package day26;

import java.util.Objects;

public class Student implements Comparable <Student> {

    private String name;
    private int rollNumber;
    private double fee;

    public Student(String name, int rollNumber, double fee) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", fee=" + fee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumber);
    }


    @Override
    public int compareTo(Student o) {
        return Double.compare(this.fee,o.fee);
    }

}

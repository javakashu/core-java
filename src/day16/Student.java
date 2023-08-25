package day16;

import day6.Teacher;

public class Student implements Comparable<Student> {

    private String name;
    private int rollNumber;
    private double fee;

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Student(String name, int rollNumber, double fee) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", fee=" + fee +
                '}';
    }

    //56 - 23 => +1
    // 26 - 56 => -1
    //23 -23 => 0

    @Override
    public int compareTo(Student o) {
//        if (this.rollNumber > o.rollNumber) {
//            return 1;
//        } else if (this.rollNumber < o.rollNumber) {
//            return -1;
//        }
//        return 0;
        return this.name.compareTo(o.name); // => this.rollNumber - o.rollNumber
    }
}

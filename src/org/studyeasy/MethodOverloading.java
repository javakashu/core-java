package org.studyeasy;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println("The area of rectangle is : " + area(14.25d, 10.65d));
        System.out.println("The area of square is : " + area(5.0d));


    }

    public static double area(double length, double breadth) {
        return length * breadth;

    }

    public static double area(double side) {
        return side * side;
    }

    public static int area(int side) {
        return side * side;
    }
}
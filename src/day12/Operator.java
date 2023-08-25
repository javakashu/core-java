package day12;

import day6.Student;

public class Operator {

    public static void main(String[] args) {

        boolean isEqual = 2 ==2;
        System.out.println(isEqual);


        // == and equal function difference

        Student student1 = new Student(1,"Green","Ten","A");
        Student student2 = new Student(2,"yellow","Ten","A");

        boolean isObjectEqual = student1.equals(student2);

        System.out.println("Is Equal student: " +isObjectEqual);


        String name1 = "Akshu";
        String name2 = "Akshu karki".substring(0,5);

        System.out.println(name2);

        System.out.println("Akshu".length());


        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        float percentage = 70;

        boolean isDistinction = percentage >=80; //greater than or equal to 80
        boolean isFirstDivision = percentage >=70 && percentage < 80; // 70 -79
        boolean isSecondDivision = percentage >=60 && percentage < 70; // 60-69
        boolean isThirdDivision = percentage >=40 && percentage < 60 ; // 40-59
        boolean isFail = percentage < 40 ; // fail

        System.out.println("Distinction: "+ isDistinction);
        System.out.println("First Division:" +isFirstDivision);
        System.out.println("Second Division:" +isSecondDivision);
        System.out.println("Third Division:" +isThirdDivision);
        System.out.println("Fail :" +isFail);



    }
}

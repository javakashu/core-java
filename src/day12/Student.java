package day12;


import java.util.Scanner;

public class Student {
    private String name;
    private float scienceMarks;
    private float mathsMarks;
    private float englishMarks;
    private float historyMarks;
    private float healthMarks;

    public Student(){

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scan.next();


        System.out.print("Enter Science marks: ");
        float scienceMarks = scan.nextFloat();

        System.out.print("Enter Maths marks: ");
        float mathsMarks = scan.nextFloat();

        System.out.print("Enter English marks: ");
        float englishMarks = scan.nextFloat();

        System.out.print("Enter History marks: ");
        float historyMarks = scan.nextFloat();

        System.out.print("Enter Health marks: ");
        float healthMarks = scan.nextFloat();


        float percentage = ((scienceMarks + mathsMarks + englishMarks + historyMarks + healthMarks) / 500) * 100;
        System.out.println("Percentage: " + percentage + "%");

        String division;
        if (percentage >= 60) {
            division = "First";
        } else if (percentage >= 45) {
            division = "Second";
        } else if (percentage >= 33) {
            division = "Third";
        } else {
            division = "Fail";
        }

        System.out.println("Division: " + division);

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        switch (grade) {
            case 'A':
                System.out.println("Excellent job, " + name + "!");
                break;
            case 'B':
                System.out.println("Good job, " + name + "!");
                break;
            case 'C':
                System.out.println("Well done, " + name + "!");
                break;
            case 'D':
                System.out.println("You can do better, " + name + "!");
                break;
            case 'E':
                System.out.println("Try harder next time, " + name + "!");
                break;
            case 'F':
                System.out.println("Sorry, " + name + ". You have failed.");
                break;
            default:
                System.out.println("Invalid grade.");
                break;
        }

    }
}



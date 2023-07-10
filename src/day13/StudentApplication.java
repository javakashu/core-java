package day13;

import java.util.Scanner;

public class StudentApplication {


    public static void main(String[] args) {

        StudentPerformance studentPerformance = new StudentPerformance();
        String continueText = "";

        do {
            Scanner scan = new Scanner(System.in);
            Scanner newScan = new Scanner(System.in);

            System.out.print("Enter your name:");
            String name = scan.nextLine();
            studentPerformance.setName(name);

            float scienceMarks = ScannerHelper.takeFloatInput("Enter Science marks:");
            float mathMarks =    ScannerHelper.takeFloatInput("Enter math marks:");
            float englishMarks = ScannerHelper.takeFloatInput("Enter english marks:");
            float socialMarks = ScannerHelper.takeFloatInput("Enter social marks:");
            float historyMarks = ScannerHelper.takeFloatInput("Enter history marks:");

            studentPerformance.setScienceMarks(scienceMarks);
            studentPerformance.setMathMarks(mathMarks);
            studentPerformance.setEnglishMarks(englishMarks);
            studentPerformance.setSocialMarks(socialMarks);
            studentPerformance.setHistoryMarks(historyMarks);
// Calculating the percentage of all the user input marks
            float grandTotal = (studentPerformance.getScienceMarks() + studentPerformance.getMathMarks() + studentPerformance.getEnglishMarks() + studentPerformance.getHistoryMarks() + studentPerformance.getSocialMarks());
            float percentage = ((grandTotal) / 500) * 100;

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
            switch (grade) {
                case 'A':
                    System.out.println("Excellent job, " + ScannerHelper.getName() + "!");
                    break;
                case 'B':
                    System.out.println("Good job, " + ScannerHelper.getName() + "!");
                    break;
                case 'C':
                    System.out.println("Well done, " + ScannerHelper.getName() + "!");
                    break;
                case 'D':
                    System.out.println("You can do better, " + ScannerHelper.getName() + "!");
                    break;
                case 'E':
                    System.out.println("Try harder next time, " + ScannerHelper.getName() + "!");
                    break;
                case 'F':
                    System.out.println("Sorry, " + ScannerHelper.getName() + ". You have failed.");
                    break;
                default:
                    System.out.println("Invalid grade.");
                    break;
            }


            System.out.println(String.format("%s percentage is %f", ScannerHelper.getName(), percentage));

            System.out.print("Do you want to create result of another student? (Y/n)");
            continueText = scan.next();

        } while (continueText.equals("Y") || continueText.equals(""));

    }

}


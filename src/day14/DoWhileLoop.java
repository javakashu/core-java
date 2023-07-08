package day14;

import day13.StudentPerformance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoWhileLoop {

        public static void main(String[] args) {

            StudentPerformance result = new StudentPerformance();
            String continueText = "";

            do {

                Scanner scan = new Scanner(System.in);
                Scanner nameScan = new Scanner(System.in);

                System.out.print("Enter your Name: ");
                String name = nameScan.nextLine();
                result.setName(name);

                float scienceMarks = takeFloatInput("Enter Science marks: ");
                float mathsMarks = takeFloatInput("Enter Maths marks: ");
                float englishMarks = takeFloatInput("Enter English marks: ");
                float historyMarks = takeFloatInput("Enter History marks: ");
                float socialMarks = takeFloatInput("Enter Social marks: ");

                result.setScienceMarks(scienceMarks);
                result.setMathMarks(mathsMarks);
                result.setEnglishMarks(englishMarks);
                result.setHistoryMarks(historyMarks);
                result.setSocialMarks(socialMarks);


                // Calculating the percentage of all the user input marks
                float grandTotal = (result.getScienceMarks() + result.getMathMarks() + result.getEnglishMarks() + result.getHistoryMarks() + result.getSocialMarks());
                float percentage = ((grandTotal) / 500) * 100;

                System.out.println(String.format("%s percentage is %f",result.getName(), percentage ));

                System.out.print("Do you want to create result of another student? (Y/n)");
                continueText = scan.next();

            }while (continueText.equals("Y") || continueText.equals(""));

        }

        public static float takeFloatInput(String message){
            Scanner scanner = new Scanner(System.in);
            System.out.println(message);
            float input = 0;
            try {
                input = scanner.nextFloat();
            }catch (InputMismatchException e){
                System.out.println("Invalid input please try again");
                return takeFloatInput(message);
            }
            return  input;
        }
    }


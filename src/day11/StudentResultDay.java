package day11;
import java.util.Scanner;

public class StudentResultDay {


        // Declaring states
        private String name;
        private float scienceMarks;
        private float mathsMarks;
        private float englishMarks;
        private float historyMarks;
        private float healthMarks;

        // Constructor
        public StudentResultDay() {
        }

        // Setters & Getters
        public void setName(String name){
            this.name=name;
        }

        public String getName(){
            return name;
        }

        public void setScienceMarks(float scienceMarks){
            this.scienceMarks=scienceMarks;
        }

        public float getScienceMarks(){
            return scienceMarks;
        }

        public void setMathsMarks(float mathsMarks){
            this.mathsMarks=mathsMarks;
        }

        public float getMathsMarks(){
            return mathsMarks;
        }

        public void setEnglishMarks(float englishMarks){
            this.englishMarks=englishMarks;
        }

        public float getEnglishMarks(){
            return englishMarks;
        }

        public void setHistoryMarks(float historyMarks){
            this.historyMarks=historyMarks;
        }

        public float getHistoryMarks(){
            return historyMarks;
        }

        public void setHealthMarks(float healthMarks){
            this.healthMarks=healthMarks;
        }

        public float getHealthMarks(){
            return healthMarks;


        }
        // Main method starts here
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            // Asking for user input
            System.out.print("Enter your Name: ");
            String name= scan.next();

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

            // Calculating the percentage of all the user input marks
            float percentage = ((scienceMarks+mathsMarks+englishMarks+historyMarks+healthMarks)/500)*100;

            System.out.println("Your percentage is " + percentage);

            // Condition to check Grades letter
            if(percentage >= 90){
                System.out.println("You've passed with grade A");
            }
            if(percentage>=80.0 && percentage<90.0){
                System.out.println("You've passed with grade B");
            }
            if(percentage>=70.0 && percentage<80.0){
                System.out.println("You've passed with grade C");
            }
            if(percentage>=60.0 && percentage<70.0){
                System.out.println("You've passed with grade D");
            }
            else if(percentage<60) {
                System.out.println("You've failed");
            }
        }
    }





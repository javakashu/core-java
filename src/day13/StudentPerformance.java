package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentPerformance {

    private String name;
    private float scienceMarks;
    private float mathMarks;
    private float englishMarks;
    private float socialMarks;
    private float historyMarks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(float scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public float getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(float mathMarks) {
        this.mathMarks = mathMarks;
    }

    public float getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(float englishMarks) {
        this.englishMarks = englishMarks;
    }

    public float getSocialMarks() {
        return socialMarks;
    }

    public void setSocialMarks(float socialMarks) {
        this.socialMarks = socialMarks;
    }

    public float getHistoryMarks() {
        return historyMarks;
    }

    public void setHistoryMarks(float historyMarks) {
        this.historyMarks = historyMarks;
    }



    public static float takeFloatInput(String Message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Message);
        float input = 0;
        try {
            input = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input . Please try again");
            return takeFloatInput(Message);
        }

        return input;
    }

}
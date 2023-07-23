package ProblemSolving;

public class Exercise {


    public static String concatenateOddTimes(String str, int N) {
        StringBuilder result = new StringBuilder();

        // Append the string N number of times
        for (int i = 0; i < N; i++) {
            result.append(str);
        }

        // Append each character of the string one more time
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "dog";
        int N = 3;
        String concatenatedString = concatenateOddTimes(str, N);
        System.out.println("Concatenated String: " + concatenatedString);



        }

    }




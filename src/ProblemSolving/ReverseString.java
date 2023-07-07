package ProblemSolving;

public class ReverseString {
    public static StringBuilder reversestring(String name) {
       // StringBuilder temp = new StringBuilder();
        return new StringBuilder(name).reverse().append("y");
    }

    public static void main(String[] args) {
        System.out.println(reversestring("Akshu"));
    }
}



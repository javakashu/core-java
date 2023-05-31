package ProblemSolving;

public class SumOfNumbers1 {
    public static void main(String args[]) {
        //method calling/invoke
        //System.out.println(fullName("Akshu","Karki"));
        SumOfNumbers1 sumOfNumbers2 = new SumOfNumbers1();

        System.out.println("Sum of given arguments/param is: "+sumOfNumbers2.getSum(112 , 115));

    }

    /**
     *
     * @param firstName
     * @param lastName
     * @return
     */
    private static String fullName(String firstName, String lastName){
        return firstName+" "+ lastName;
    }

    public int getSum(int n1 , int n2){
        return n1 + n2 ;
    }

}




// Write a program to reverse a word example akshu uhska
// Write a method to find sum of two number




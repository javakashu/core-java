package ProblemSolving;

import java.util.Scanner;

public class ExampleExceptionHandling {
    static Scanner sc;

    public static void main(String[] args) throws ArithmeticException {

        sc = new Scanner(System.in);

        try {
            m1();
        } catch (ArithmeticException e) {
        }
        m2();
    }
    static void m1() throws ArithmeticException  {
        int result = 0;
        System.out.println("Enter a num :");
        int num = sc.nextInt();
////        try {
            result = 10 / num;
               System.out.println(result);
//        }
//        catch (ArithmeticException e){
//            System.out.println("exception has been caught and program will execute smoothly");
//        }

        int final_val = result +10;
        System.out.println("Important work"+final_val);
    }
    static void m2(){
        System.out.println("from m2");

    }
     void m3(int x ){

        if(x ==0)
            throw new ArithmeticException();
         System.out.println("Hello");

    }
}

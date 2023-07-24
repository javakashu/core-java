package day16;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the value of N: ");
//
//        double N = scanner.nextDouble();
//
//        System.out.println(calculatePower(N));

        // p*t*r / 100

        BigDecimal p = BigDecimal.valueOf(5000);
        float t = 5;
        float r = 9.99f;

        BigDecimal interest = p.multiply(BigDecimal.valueOf(t)).multiply(BigDecimal.valueOf(r)).divide(BigDecimal.valueOf(100));
        System.out.println(interest);

        BigInteger negativeNumber = BigInteger.valueOf(-100);
        if(negativeNumber.signum() < 0 ){
            System.out.println("Yes it is negative");
        }

    }

    public static BigDecimal calculatePower(double N) {

        //write your logic here

        BigDecimal bigN = BigDecimal.valueOf(N);


        // double result = Math.pow(N,11);

        return bigN.pow(11);

    }
}

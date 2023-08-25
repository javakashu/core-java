package day19;

import java.math.BigInteger;
import java.util.ArrayList;

public class ArrayListLimitation {

    public static void main(String[] args) {

        Float a = 5f; // --> Autoboxing

        float b = a; // --> Auto unboxing

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(null);

        Integer c = integers.get(2);

        System.out.println(c);

        // Convert string to any primitive type

        int result = Integer.parseInt("500");
        boolean result3 = Boolean.parseBoolean("true");

        //comparison (Sorting)

        int compareResult = Integer.compare(200,200);
        System.out.println(compareResult);

        BigInteger integer = new BigInteger("500");






    }

}

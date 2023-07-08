package day12;

import java.math.BigDecimal;

public class ImplicitConversion {

    public static void main(String[] args) {

        byte b = 2 ;

        short s = b;

        int i = s;

        long l = 12334244533434L;

        double d = l;

        System.out.println(l);
        System.out.println(d);

        BigDecimal bd = BigDecimal.valueOf(l);
        System.out.println(bd);




    }
}

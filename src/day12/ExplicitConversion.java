package day12;

public class ExplicitConversion {

    public static void main(String[] args) {


        double d = 2.56;
        float f = (float)d;
        System.out.println(f);

        double p = 700;
        int t = 3;
        float r = 9.5f;

        long interest = Math.round((p*t*r)/100);
        System.out.println(interest);

    }

}

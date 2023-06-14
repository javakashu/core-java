package org.studyeasy;

public class TestArithmeticOperation {


    public static void main(String[] args) {

        int a =3;
        a = a++;
        System.out.println("post-Increment a:" +a);

        a =++a;
        System.out.println("Pre-Decrement a:" +a);

        a =a--;
        System.out.println("Post-Decrement a:"+a);

        a =--a;
        System.out.println("Pre-Decrement a:"+a);

    }





}

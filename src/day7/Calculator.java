package day7;

public class Calculator {

    //polymorphism

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        cal.add(2,21);
        cal.add(2,3,5);

    }
    // function overloading
    public void add(int a , int b){
        int temp = a+b;
        System.out.println(temp);
    }
    public void add(int a , int b , int c) {
        int temp = a + b + c;
        System.out.println(temp);
    }

}

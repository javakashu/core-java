package day14;

public class BlockScope {

    int a = 2; // Global variable
    //int result = 0;
     private static final float PI  = 3.14f;


    public static void main(String[] args) {
        BlockScope blockScope = new BlockScope();

        blockScope.sumFunction();
        System.out.println(PI);
        // blockScope.someFunction1();

    }

    public void sumFunction() {
        int b = 3; // Local variable
        // sumFunction(); // Recursion => Should have some break condition

        // System.out.println(a);
        int result = 10;
        System.out.println(PI);


    }

    public void someFunction1() {
        System.out.println(PI);

    }

}

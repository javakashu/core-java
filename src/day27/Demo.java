package day27;

public class Demo {

    public static void main(String[] args) {

        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

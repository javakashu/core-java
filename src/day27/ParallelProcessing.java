package day27;

import day6.Teacher;

public class ParallelProcessing {

    public static void main(String[] args) {

        ParallelProcessing parallelProcessing = new ParallelProcessing();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                parallelProcessing.print();
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                parallelProcessing.print();

            }
        };

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();
    }

    public void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

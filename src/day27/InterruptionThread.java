package day27;

public class InterruptionThread {

    public static void main(String[] args) {

        Runnable runnable1 = () -> {
            System.out.println("Thread 1 Started");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
           //     e.printStackTrace();
                return;
            }

            System.out.println("Thread 1 Completed");
        };

        Runnable runnable2 = () -> {
            System.out.println("Thread 2 Started");

            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
              //  e.printStackTrace();
                return;
            }

            System.out.println("Thread 2 Completed");
        };

        Thread t1 = new Thread(runnable1);
        t1.setName("Thread T1");
        t1.start();

        Thread t2 = new Thread(runnable2);
        t2.setName("Thread T1");
        t2.setDaemon(true);
        t2.start();
      //  t1.interrupt();


//        for(int i =0;i< 100000000;i++){
//
//        }

    }
}

package day27;

public class InterruptionThread {

    public static void main(String[] args) {

        Runnable runnable1 = () -> {
            System.out.println("Thread Started");

//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                return;
//            }

            System.out.println(Thread.currentThread().isInterrupted());
            if(Thread.currentThread().isInterrupted()){
                return;
            }
            System.out.println("Thread Completed");
        };

        Thread t1 = new Thread(runnable1);
        t1.setName("Thread T1");
        t1.start();
        t1.interrupt();


//        for(int i =0;i< 100000000;i++){
//
//        }

    }
}

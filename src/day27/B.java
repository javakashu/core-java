package day27;

public class B implements Runnable {
    @Override
    public void run() {
                for(int i =1; i<5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

//    public void run(){
//
//        for(int i =1; i<5;i++){
//            System.out.println("hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
}

package day27;

public class A implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i< 5; i++ ){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

//    public void run(){
//
//        for (int i = 1; i< 5; i++ ){
//            System.out.println("hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
}



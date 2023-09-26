package Udemy;

public class Door {

    private Lock lock;

    public Door(){
        lock = new Lock(true);
    }

    public Lock getLock() {
        return lock;
    }

    public void shopStatus(){
        if(lock.isLock()){
            System.out.println("The shop is closed please visit later");
        }else {
            System.out.println("welcome we are open");
        }
    }

    class Lock{
        private boolean lock;

        public Lock(boolean lock){
            this.lock = lock;
        }


        private boolean isLock(){
            return lock;
        }

        public void setLock(boolean lock){
            this.lock = lock;
        }

    }


}

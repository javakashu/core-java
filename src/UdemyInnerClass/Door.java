package UdemyInnerClass;

public class Door {
    private class Lock{
        public boolean isLocked(String key){
            if(key.equals("qwerty")){
                return false;
            }else {
                return true;
            }
        }
    }
    public boolean isLocked(String key){


        return new Lock().isLocked(key);
    }
}

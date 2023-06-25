package day10;

public class Door {

    private static long counter;
    private  String name;

    public Door(String name) {
        this.name = name;
    }

  public  void personEntered(){
        counter += 1; // counter = counter + 1 or ++ counter

  }
    public  void  personExited(){
        counter -=1;

    }

    public static long getCounter(){
        return counter;
    }
}

package day9;

public class GarageApplication {


    public static void main(String[] args) {
        Car hyundaiElantra = new Car("Hyundai","Elantra","Black",5);
        Car.increaseCount();

        Car hyundaiAccent = new Car("Hyundai","Accent","Red",5,true);
        Car.increaseCount();

        System.out.println("Elantra:"+ Car.getCount());
        System.out.println("Accent:"+  Car.getCount());
    }
}

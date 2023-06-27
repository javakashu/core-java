package day9;

public class Car {

    private static int count;
    private String make;
    private String model;
    private String color;
    private int noOfSeats;
    private boolean isAutomatic;

    public Car(String make, String model, String color, int noOfSeats) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.noOfSeats = noOfSeats;
    }

    public Car(String make, String model, String color, int noOfSeats, boolean isAutomatic) {
//        this.make = make;
//        this.model = model;
//        this.color = color;
//        this.noOfSeats = noOfSeats;
        this(make, model, color, noOfSeats);
        this.isAutomatic = isAutomatic;
    }

    public static void increaseCount() {
        count = count + 1;

    }

    public static int getCount() {
        return count;
    }




    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", isAutomatic=" + isAutomatic +
                '}';
    }
}



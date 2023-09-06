package org.studyeasy;

public class HelloCar {
    public static void main(String[] args) {

        Car car = new Car("closed","on","seated",10);


       // car.setSpeed(10);
        //System.out.println(car.getSpeed());

//        car.setDoors("not closed");
//        car.setDriver("seated");
//        car.setEngine("on");
//        car.setSpeed(10);

       // System.out.println(car.getDoors());

        System.out.println(car.run());


    }
}

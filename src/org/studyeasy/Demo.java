package org.studyeasy;

import org.studyeasy.vehicles.Bike;
import org.studyeasy.vehicles.Car;

public class Demo {
    public static void main(String[] args) {

       Bike bike = new Bike("short","petrol",2,2,20,"LED");
       bike.run();
        System.out.println(bike.getHandle());







    }
}

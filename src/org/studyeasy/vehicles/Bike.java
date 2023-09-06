package org.studyeasy.vehicles;

import org.studyeasy.parent.Vehicle;

public class Bike extends Vehicle {

    private String handle;

    public Bike(){
        super();
        this.handle ="short";
    }

    public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
        super(engine, wheels, seats, fuelTank, lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle= "+ getHandle() +"," + "engine = " +getEngine() +"," +"wheels= " +getWheels()
                +"," +"Seats= "+getSeats()+","+ "Fuel tank= "+getFuelTank()+","+"Lights= "+getLights()+
                '}';
    }

//    public void run() {
//        System.out.println("Running bike");
//        System.out.println(toString());
//    }

    }


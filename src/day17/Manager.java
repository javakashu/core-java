package day17;

import java.io.Serializable;
import java.time.LocalDate;

public  class Manager extends Employee implements Comparable<Manager>, Serializable  {
    private double bonus;
    public Manager(long id , String name, LocalDate joiningDate,double salary,double bonus){
        super(id,name,joiningDate,salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public double getSalary(){
        // different logic ==> salary + bonus;
        return super.getSalary()+bonus;
    }

    @Override
    public void printDescription() {

    }

    @Override
    public int compareTo(Manager o) {
        return 0;
    }
}



package day17;

import java.time.LocalDate;

public final class Cleaner extends Employee{


    public Cleaner(long id, String name, LocalDate joiningDate, double salary) {
        super(id, name, joiningDate, salary);
    }

    @Override
    public LocalDate getJoiningDate() {
        return super.getJoiningDate();
    }

    @Override
    public void printDescription() {

    }
}

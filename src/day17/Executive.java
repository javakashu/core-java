package day17;

import java.time.LocalDate;

public final class Executive extends Manager {

    private int numberOfShares;

    public Executive(long id, String name, LocalDate joiningDate, double salary, double bonus, int numberOfShares) {
        super(id, name, joiningDate, salary, bonus);
        this.numberOfShares = numberOfShares;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public void fireEmployee(Employee employee) {
        if (employee instanceof Programmer) {

            System.out.println(((Programmer) employee).getJobRole());

        }
//
//    public void fireEmployee(Programmer programmer){
//
//    }
//    public void fireEmployee(Manager manager){
//    }
//    public  void fireEmployee(Cleaner cleaner){
//
//    }

    }
}

package day17;

import java.time.LocalDate;

public final class Programmer extends Employee {

    private String jobRole;

    public Programmer(long id, String name, LocalDate joiningDate, double salary, String jobRole) {
        super(id, name, joiningDate, salary);
        this.jobRole = jobRole;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    @Override
    public void printDescription() {

    }
}

package day6;

public class Staff extends Person {

    private String name;
    private int age;
    private String address;

    private int salary;
    private String position;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

package day6;

/**
 * This is the description of staff class
 * @author Akshu Karki
 * @since 1.8
 */
public class Staff extends Person {

    private String name;
    private int age;
    private String address;

    private int salary;
    private String position;

    /**
     * Call this function to get salary of the Staff
     * @return integer salary of the staff
     */
    public int getSalary() {
        return salary;
    }

    /**
     * call this function with integer salary
     * @param salary This is integer salary of the staff
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Call this function to get position of the staff
     * @return String position of the staff
     */
    public String getPosition() {
        return position;
    }

    /**
     * call this function with string position
     * @param position This is string position of the staff
     */
    public void setPosition(String position) {
        this.position = position;
    }
}

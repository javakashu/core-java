package day6;

/**
 * This is the description of teacher class
 * @author Akshu Karki
 * @since 1.8
 */
public class Teacher extends Person {

    private String name;
    private int age;
    private String subject;
    private String address;
    private int salary;

    /**
     * Call this function to get the salary of the teacher
     * @return integer salary of the teacher
     */
    public int getSalary() {
        return salary;
    }
    /**
     * Call this function with integer salary
     * @param salary This is integer salary of the teacher
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    /**
     * Call this function to get the subejct taught by  the teacher
     * @return String subject of the teacher
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Call this function with string subject
     * @param subject This is string subject of the teacher
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }


}

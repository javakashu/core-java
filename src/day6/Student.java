package day6;


/**
 * This is the description of student class
 * @author Akshu Karki
 * @since 1.8
 */
//Student is a person
public class Student extends Person {

    private String name;
    private int age;
    private int rollNumber;
    private String address;
    private String house;
    private String studentClass;
    private String section;


    /**
     * Using this Constructor create object of Student

     */
    public Student(String abc , String bcd){

    }

    /**
     * Call this function to get the RollNumber of the Student
     * @return integer RollNumber of the Student
     * @since 1.8
     */
    public int getRollNumber() {
        return rollNumber;
    }

    /**
     * Call this function with integer RollNumber
     * @param rollNumber This is integer RollNumber of the Student
     */
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    /**
     * Call this function to get House of the Student
     * @return String House of the student
     */
    public String getHouse() {
        return house;
    }

    /**
     * Call this function with String House
     * @param house This is String House of the Student
     */
    public void setHouse(String house) {
        this.house = house;
    }

    /**
     * Call this function to get the Class of the Student
     * @return Class of the Student in String
     */
    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
    /**
     * Call this function to get the section of the Student
     * @return section of the Student in String
     */
    public String getSection() {
        return section;
    }


    public void setSection(String section) {
        this.section = section;
    }

    /**
     * Call this function to get object as a string. Use it for debugging
     * @return all the states if the object in string format
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                ", address='" + address + '\'' +
                ", house='" + house + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", section='" + section + '\'' +
                '}';
    }

}

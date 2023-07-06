package day6;


/**
 * This is the description of person class
 * @author Akshu Karki
 * @since 1.8
 */
public class Person {

    private String name;
    private int age;
    private String address;

    /**
     * Call this function to get the name of the person
     * @return String name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * call this function with string name
     * @param name This is string name of the person
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Call this function to get the age of the person
     * @return integer age of the person
     */
    public int getAge() {
        return age;
    }
    /**
     * call this function with int age
     * @param age This is int age of the person
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Call this function to get the address of the person
     * @return String address of the person
     */
    public String getAddress() {
        return address;
    }
    /**
     * call this function with string address
     * @param address This is string address of the person
     */
    public void setAddress(String address) {
        this.address = address;
    }
}

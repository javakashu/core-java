package day6;

public class NamunaVidyaMandirApplication {

    public static void main(String[] args) {

        Student akshu =new Student();
        akshu.setHouse("Green");
        akshu.setSection("A");
        akshu.setStudentClass("Ten");
        akshu.setRollNumber(17);
        akshu.setName("Akshu Karki");
        akshu.setAge(16);
        akshu.setAddress("Madhumara");

        System.out.println(akshu.getName());
        System.out.println(akshu.getAge());


        Teacher shankarSir = new Teacher();
        shankarSir.setSalary(25000);
        shankarSir.setSubject("Math");
        shankarSir.setAge(50);
        shankarSir.setName("Shankar Pyakurel");
        shankarSir.setAddress("Madhumara");

        System.out.println(shankarSir.getName());
        System.out.println(shankarSir.getSalary());

    }


}

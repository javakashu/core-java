package day17;

import java.time.LocalDate;
import java.time.Month;

public class OfficeApp {

    public static void main(String[] args) {

//        Employee employee = new Employee(0,"Taman", LocalDate.now(),5000);
//
//        System.out.println(employee.getId());
//        System.out.println(employee.getName());
//        System.out.println(employee.getJoiningDate());
//        System.out.println(employee.getSalary());


        System.out.println("====================================");

        Programmer programmer1 = new Programmer(2,"Junu",LocalDate.of(2023, Month.FEBRUARY,2),3000,"Senior");

        System.out.println(programmer1.getId());
        System.out.println(programmer1.getName());
        System.out.println(programmer1.getJoiningDate());
        System.out.println(programmer1.getSalary());
        System.out.println(programmer1.getJobRole());

        System.out.println("====================================");

        Executive executive = new Executive(3,"Akshu", LocalDate.now(),5000,2000,5000);

        System.out.println(executive.getId());
        System.out.println(executive.getName());
        System.out.println(executive.getJoiningDate());
        System.out.println(executive.getSalary());
        System.out.println(executive.getBonus());

        Manager manager = new Manager(1,"ABC", LocalDate.now(),5000,2000);

        System.out.println(manager.getId());
        System.out.println(manager.getName());
        System.out.println(manager.getJoiningDate());
        System.out.println(manager.getSalary());
        System.out.println(manager.getBonus());

        System.out.println("====================================");



    }
}

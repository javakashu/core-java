package day17;

import java.time.LocalDate;
import java.time.Month;

public class RumTimePolymorphismTest {

    public static void main(String[] args) {

        Manager manager = new Manager(1, "ABC", LocalDate.now(), 5000, 2000);
        Programmer programmer1 = new Programmer(2, "Junu", LocalDate.of(2023, Month.FEBRUARY, 2), 3000, "Senior Java Developer");
        Executive executive = new Executive(3, "Akshu", LocalDate.now(), 5000, 2000, 5000);

        executive.fireEmployee(manager);
        executive.fireEmployee(programmer1);
        // executive.fireEmployee(executive);

        // Employee employee = new  Manager(1,"ABC", LocalDate.now(),5000,2000);

        // System.out.println(employee.getSalary());

        //  Employee manager1 = new Executive(3,"Akshu", LocalDate.now(),5000,2000,5000);

    }
}

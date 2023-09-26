package designpattern;

import java.time.LocalDateTime;

public class BuilderPatternPractice {

    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder();


        builder
                .append("Hi ")
                .append("welcome ")
                .append("to ")
                .append("Design Pattern");


        AppointmentInfo appointmentInfo = new AppointmentInfo();

        appointmentInfo
                .setSpeciality("Gastric")
                 .setDoctor("Akshu")
                 .setAppointmentTime(LocalDateTime.of(2023,9,21,8,30))
                 .setMessage("Pet Dukheko cha");

        System.out.println(appointmentInfo);
    }
}

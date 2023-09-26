package designpattern;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AppointmentInfo {

    private String speciality;
    private String doctor;
    private LocalDateTime appointmentTime;
    private String message;

    public AppointmentInfo(String speciality, String doctor, LocalDateTime appointmentTime, String message) {
        this.speciality = speciality;
        this.doctor = doctor;
        this.appointmentTime = appointmentTime;
        this.message = message;
    }

    public AppointmentInfo() {
    }

    public String getSpeciality() {
        return speciality;
    }

    public  AppointmentInfo setSpeciality(String speciality) {
        this.speciality = speciality;
        return this;
    }

    public String getDoctor() {
        return doctor;
    }

    public AppointmentInfo setDoctor(String doctor) {
        this.doctor = doctor;
        return this;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public AppointmentInfo setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AppointmentInfo setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "AppointmentInfo{" +
                "speciality='" + speciality + '\'' +
                ", doctor='" + doctor + '\'' +
                ", appointmentTime=" + appointmentTime +
                ", message='" + message + '\'' +
                '}';
    }
}

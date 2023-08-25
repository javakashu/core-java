package day18;

import java.util.Objects;

public class Ambulance {

    private long id;
    private String hospitalName;
    private String phoneNumber;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ambulance ambulance = (Ambulance) o;
        return id == ambulance.id && Objects.equals(phoneNumber, ambulance.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneNumber);
    }

    @Override
    public String toString() {
        return "Ambulance{" +
                "id=" + id +
                ", hospitalName='" + hospitalName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

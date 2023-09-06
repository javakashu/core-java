package Task;

public class Crocodile extends Reptile {

    public Crocodile() {
        super();
        egg = "Hard Shelled";
    }


    public String showInfo() {
        return "Crocodile{" +
                "skin='" + skin + '\'' +
                ", egg='" + egg + '\'' +
                ", backbone=" + backbone +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}

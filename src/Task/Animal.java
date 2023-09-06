package Task;

public class Animal {

    protected float height;
    protected float weight;
    protected String animalType;
    protected String bloodType;

    public Animal(){
        this.height =0;
        this.weight=0;
        this.animalType="unknown";
        this.bloodType="unknown";
    }
    public String showInfo(){
        return "Animal [height="+height +", weight="+weight
                +", animalType="+animalType+", bloodType="+bloodType+"]";
    }
}

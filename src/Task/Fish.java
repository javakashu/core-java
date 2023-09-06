package Task;

public class Fish extends Animal {

    protected boolean waterBone = true;
    protected boolean gills = true;

    public Fish(){
        animalType ="fish";
        this.waterBone=true;
        this.gills = true;
    }


    public String showInfo() {
        return "Fish{" +
                "waterBone=" + waterBone +
                ", gills=" + gills +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}



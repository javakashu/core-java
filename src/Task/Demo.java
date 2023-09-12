package Task;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Animal> animals =new ArrayList<>();

        Animal animal = new Animal();
        Animal reptile = new Reptile();
        Animal croc = new Crocodile();
        Animal eel = new Eel();
        Animal eagle = new Eagle();

        animals.add(animal);
        animals.add(reptile);
        animals.add(croc);
        animals.add(eel);
        animals.add(eagle);
        listAnimals(animals);
    }

    public static void listAnimals(List<Animal> animals){
        for(Animal animal :animals){
            System.out.println(animal.showInfo());
        }
    }
}

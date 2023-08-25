package day18;


public class CosmicClass {

    public static void main(String[] args) {

//        CosmicClass cosmicClass = new CosmicClass();
//        System.out.println(cosmicClass.toString());
//        System.out.println(cosmicClass.equals(cosmicClass));
//        System.out.println(cosmicClass.hashCode());

        Ambulance ambulance = new Ambulance();
        System.out.println(ambulance);

        System.out.println(ambulance.hashCode());

        Ambulance ambulance1 = new Ambulance();
        System.out.println(ambulance1.hashCode());
        System.out.println(ambulance1);

        System.out.println(ambulance.equals(ambulance1));



    }
}

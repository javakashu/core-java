package day10;

public class ShoppingMallApplication {

    public static void main(String[] args) {
        Door entryDoor = new Door("East Door");
        Door exitDoor = new Door("West Door");

        entryDoor.personEntered();
        entryDoor.personEntered();
        entryDoor.personEntered();

        exitDoor.personExited();
        exitDoor.personExited();

        System.out.println(Door.getCounter());

        if(Door.getCounter()==0){
            System.out.println("Close the Door");
        }else {
            System.out.println("Inform the guards");
        }
    }

}

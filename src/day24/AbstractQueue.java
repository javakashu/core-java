package day24;

public abstract class AbstractQueue<E> implements Queue<E>{

    @Override
    public void remove(int index) {
        System.out.println("The remove logic goes here - Ac");
    }

    @Override
    public int size() {
        System.out.println("The size logic goes here- Ac");
        return 0;
    }
}

package Udemy;

public abstract class Person implements IsAlive,LiveLife {

    public void speak() {
        System.out.println("Share his/her thoughts");
    }
        public abstract void  eat();
    @Override
    public void breathe(){
        System.out.println("Be alive , remain living");

    }
    @Override
    public void message(){
        System.out.println("Life is a Journey, keep moving and meet new people");

    }
}

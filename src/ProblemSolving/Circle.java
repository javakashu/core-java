package ProblemSolving;

public class Circle {

    private double radius;


    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Area: "+c.getArea());
        System.out.println("Circumference: "+c.getCircumference());
        c.setRadius(3.0);
        System.out.println("Updated Area: "+c.getArea());

    }

    public Circle(double r){
        radius = r;

    }
    public double getArea(){

        return Math.PI*radius*radius;
    }
    public double getCircumference(){

        return 2*Math.PI*radius;
    }
    public void setRadius(double r){
        radius = r;
    }
}

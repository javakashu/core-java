package StaticElements;

public class App {
    public static void main(String[] args) {

        System.out.println("current variable value:"+ TestStatic.getStaticVariable());
        TestStatic.setStaticVariable(1);
        System.out.println("current variable value :" + TestStatic.getStaticVariable());


        System.out.println("current variable value:"+ TestStatic.getStaticVariable());
        TestStatic.setStaticVariable(24);
        System.out.println("current variable value:"+ TestStatic.getStaticVariable());


        System.out.println("current variable value:"+ TestStatic.getStaticVariable());

    }
}

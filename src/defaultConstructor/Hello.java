package defaultConstructor;

public class Hello {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("samsung");
        System.out.println(phone.getBrand());
    }
}

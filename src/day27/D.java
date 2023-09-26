package day27;

public class D {
    public static void main(String[] args) {

        String str1 = new String("Open");
        String str2 = new String("Source");
        String str3 = new String("opengenus");
        str3 = str1;
        str2 = str3 ;
        // Garbage collector runs here .
        str1 = str2;

    }
}

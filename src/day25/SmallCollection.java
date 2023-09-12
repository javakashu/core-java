package day25;

import java.util.*;

public class SmallCollection {

    public static void main(String[] args) {


        List<String> names = List.of("Taman","Akshu","Junu");
        System.out.println(names);

//        Set<String> petName = Set.of("ABC","BCD");
//        System.out.println(petName);
//
//        Map<String,String> userInfo = Map.ofEntries(Map.entry("name","Taman"),Map.entry("age","30"),Map.entry("gender","Male"));


        ArrayList<String> mutableName = new ArrayList<>(names);
        System.out.println(names);

        System.out.println(names == mutableName);
        mutableName.add("ABC");

        System.out.println(mutableName);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        List<Integer> part= numbers.subList(4,8);
        part.add(78);
        System.out.println(part);


       List<Integer> scoreList =  Collections.nCopies(10,0);

        System.out.println(scoreList);


    }

    public List<String> getUserList(){
        ArrayList<String> userList = new ArrayList<>();
        userList.add("Taman");
        userList.add("Akshu");
        userList.add("Junu");

        return Collections.unmodifiableList(userList);
    }

}

package day25;

import java.util.*;

public class MapPractice {

    public static void main(String[] args) {

        TreeMap<String, Object> infoMap = new TreeMap<>();

        infoMap.put("name","Taman");
        infoMap.put("age",29);
        infoMap.put("gender","Male");
        infoMap.put("isActive",true);


        System.out.println(infoMap);

        System.out.println(infoMap.keySet());

        System.out.println(infoMap.values());

        System.out.println(infoMap.get("gender"));

        if(infoMap.containsKey("genderrr")){
            System.out.println(infoMap.get("genderrr"));
        }
        EnumMap<Month,Integer> usersMap = new EnumMap<Month,Integer>(Month.class);

        usersMap.put(Month.JAN,10);
        usersMap.put(Month.FEB,23);
        System.out.println(usersMap.put(Month.AUG,2));

    }
}

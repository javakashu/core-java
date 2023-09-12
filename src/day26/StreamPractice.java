package day26;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {

        List<String> weekDays = List.of("Sunday","Monday","Tuesday",
                "Wednesday","Thursday","Friday","Saturday","Saturday");

        Stream<String> weekDaysStream = weekDays.parallelStream();

        LinkedList<String> weekDaysLinkedList = new LinkedList<>(weekDays);

            List<String> processedList = weekDaysStream
                    .distinct()
                    .sorted()
                    .limit(1)

//                    .peek(s -> {
//                        System.out.println(s);
//                    })
//
                    .collect(Collectors.toList());

        System.out.println(processedList);

        List<Integer> amount = List.of(200,400,100,50,800,800);


        LinkedHashSet<Integer> distinct = new LinkedHashSet<>(amount);


        amount.stream().distinct().sorted().collect(Collectors.toList());

        int maxvalue = amount.parallelStream()
                .sorted()
                .limit(1)
                .collect(Collectors.toList()).get(0);

        System.out.println(maxvalue);

        List<Integer> filteredList = amount.stream()
                .distinct()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        if(integer > 100)return true;
                        return false;
                    }
                })
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }
}

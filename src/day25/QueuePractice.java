package day25;

import java.util.ArrayDeque;

public class QueuePractice {

    /*
        1. [{}] => valid
        2. {[}] => invalid
        3. {{} => invalid
        4. }[]{}{}
        5. [{]}
    */
    public static void main(String[] args) {

//        ArrayDeque<String> nameQueue = new ArrayDeque<>();
//
//        nameQueue.addFirst("Taman");
//        nameQueue.addFirst("Akshu");
//        nameQueue.addFirst("Junu");
//
////        System.out.println(nameQueue);
////
////        System.out.println(nameQueue.getFirst());
////        System.out.println(nameQueue.getLast());
//
//        System.out.println(nameQueue);
//
//        System.out.println(nameQueue.remove());
//        System.out.println(nameQueue);
//        System.out.println(nameQueue.remove());
//        System.out.println(nameQueue);
//        System.out.println(nameQueue.remove());
//        System.out.println(nameQueue);
//        System.out.println(nameQueue.remove());
//        System.out.println(nameQueue);
//        System.out.println(nameQueue.remove());
//        System.out.println(nameQueue);
//        System.out.println(nameQueue.remove());
//        System.out.println(nameQueue);
//        System.out.println(nameQueue.remove());
//        System.out.println(nameQueue);

        String syntax = "{{]}";

        ArrayDeque<Character> characters = new ArrayDeque<>();
        boolean isValid = true;

        for (int i = 0; i < syntax.length(); i++) {
            char c = syntax.charAt(i);
            System.out.println(c);

            if ((c == '}' || c == ']') && i == 0) {
                isValid = false;
                break;
            }

            if (c == '[' || c == '{') {
                characters.addFirst(c);
            }

            if (c == ']') {
                if (characters.peek() == '[') {
                    characters.poll();
                }
            }
            if (c == '}') {
                if (characters.peek() == '{') {
                    characters.poll();
                }
            }

        }

        if (!isValid) {
            System.out.println("Is not valid");
            return;
        }

        if (characters.size() == 0) {
            System.out.println("Is valid");
            System.out.println(characters);
        } else {
            System.out.println("Is not valid");
            System.out.println(characters);
        }

    }
}


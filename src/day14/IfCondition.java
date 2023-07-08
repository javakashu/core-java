package day14;

import java.util.Scanner;

public class IfCondition {

    private static  final int TARGET = 10;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true){

            System.out.println("What is your name ? ");
            String name = sc.next();

            System.out.println("What is your sales ? ");
            int sales = sc.nextInt();

            User user1 = new User(name,sales);

            if(user1.getSales()>= TARGET){
                user1.setBonus(user1.getBonus() + 100);
            }else {
                user1.setBonus(user1.getBonus() - 10);
            }

            System.out.println(user1);

        }
    }

}

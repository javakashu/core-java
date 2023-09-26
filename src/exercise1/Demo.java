package exercise1;

import day13.ScannerHelper;


public class Demo {

    public static void main(String[] args) {

        Library library = new Library();
       int lateDate = ScannerHelper.takeIntegerInput("Enter number of dates late:");
       boolean isVIP = ScannerHelper.takeBooleanInput("Are you a VIP member (Yes/No) ?");

         library.setNumberOfDays(lateDate);
         library.setVIPMember(isVIP);
         System.out.println(library.feeTable());







    }
}

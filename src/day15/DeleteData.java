package day15;

import java.util.ArrayList;

public class DeleteData {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        int indexToDelete = 2;

        if (deleteDataExceptLastIndex(myList, indexToDelete)) {
            System.out.println("Data at index " + indexToDelete + " has been deleted.");
        } else {
            System.out.println("Cannot delete data from the last index.");
        }

        System.out.println(myList);
    }

    public static boolean deleteDataExceptLastIndex(ArrayList<Integer> list, int index) {
        if (index < list.size() - 1) {
            list.remove(index);
            return true;
        } else {
            return false;
        }
    }
}

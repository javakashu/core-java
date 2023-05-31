package ProblemSolving;

public class MiddleName {
//    public static void main(String[] args) {
//        //System.out.println("Enter you Name: " + getMiddleName("Akshu", "Bahadur", "Karki"));
//        System.out.println("Enter your firstname:" +getReverseName("Akshu"));
//    }
//
//    //If user has no middle name then, set middle name to "Kumar"
//    private static String getMiddleName(String firstName, String middleName, String lastName) {
//        if (middleName.equals("")) middleName = "Kumar";
//        return firstName +" "+ middleName+" " + lastName;
//    }
//
//    //write a method to reverse your first name ->akshu <->uhska
    public static String reverseName(String name) {
        StringBuilder reversedName = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedName.append(name.charAt(i));
        }
        return reversedName.toString();
    }

    // Example usage
    public static void main(String[] args) {
        String firstName = "Akshu";
        String reversedName = reverseName(firstName);
        System.out.println(reversedName);
    }
}
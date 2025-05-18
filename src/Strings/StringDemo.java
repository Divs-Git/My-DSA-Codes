package Strings;

public class StringDemo {
    public static void main(String[] args) {
        String first = "Java";
        String second = new String("JavaScript");

        System.out.println(first);
        System.out.println(second);

        // String operation
        String greet = "Hello World";
        System.out.println("String: " + greet);
        System.out.println(greet.length());

        // Joining two string
        String joinedString = first.concat(second);
        System.out.println(joinedString);

        // compare
        System.out.println(first.equals(second)); // check for value
        System.out.println(first == second); // check for reference
    }
}

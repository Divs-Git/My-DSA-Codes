package arrays;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // add elements
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("Swift");
        languages.add(1,"C++");

        System.out.println(languages);

        // access
        System.out.println(languages.get(2));

        // replace
        languages.set(1,"Python");
        System.out.println(languages);

        // remove
        languages.remove(2);
        System.out.println(languages);

        // iteration
        for(String language : languages) {
            System.out.println(language);
        }
    }
}

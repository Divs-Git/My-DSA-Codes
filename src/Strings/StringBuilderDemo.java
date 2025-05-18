package Strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(str);

        System.out.println(sb);
        System.out.println(sb1);

        sb.append("abc");
        System.out.println(sb);

        // insert
        // range -> 0 - length
        sb.insert(0,'z');
        System.out.println(sb);

        // setCharAt
        sb.setCharAt(2,'q');
        System.out.println(sb);

        sb.toString();
        System.out.println(sb);
    }
}

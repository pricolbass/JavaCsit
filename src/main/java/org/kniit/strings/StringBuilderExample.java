package org.kniit.strings;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        sb.append(" World");
        System.out.println(sb);

        sb.insert(4, '!');
        System.out.println(sb);

        sb.delete(8, 10);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}

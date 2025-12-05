package org.kniit.strings;

import java.util.Arrays;

public class StringMethodsExample {

    public static void main(String[] args) {

        String str = "Hello, World!";

        // int length()
        System.out.println("length(): " + str.length()); // 17

        // boolean isEmpty()
        System.out.println("isEmpty(): " + str.isEmpty()); // false

        // char charAt(int index)
        System.out.println("charAt(3): " + str.charAt(3)); // 'l'

        // byte[] getBytes(String charsetName)
        byte[] bytes = str.getBytes();
        System.out.println("getBytes(): " + Arrays.toString(bytes));

        // boolean equals(Object anObject)
        System.out.println("equals(\"Hello, World!\"): " + str.equals("Hello, World!")); // true

        // boolean startsWith(String prefix)
        System.out.println("startsWith(\"He\"): " + str.startsWith("  He")); // true

        // boolean endsWith(String suffix)
        System.out.println("endsWith(\"!\"): " + str.endsWith("!  ")); // true

        // int indexOf(int ch)
        System.out.println("indexOf('o'): " + str.indexOf('o')); // 5

        // int lastIndexOf(int ch)
        System.out.println("lastIndexOf('l'): " + str.lastIndexOf('l')); // 15

        // String substring(int beginIndex)
        System.out.println("substring(2): " + str.substring(2)); // "Hello, World!  "

        // String substring(int beginIndex, int endIndex)
        System.out.println("substring(2, 7): " + str.substring(2, 7)); // "Hello"

        // String[] split(String regex)
        String[] words = str.trim().split(", ");
        System.out.println("split(\", \"): " + Arrays.toString(words)); // ["Hello", "World!"]

        // String toLowerCase()
        System.out.println("toLowerCase(): " + str.toLowerCase()); // "  hello, world!  "

        // String toUpperCase()
        System.out.println("toUpperCase(): " + str.toUpperCase()); // "  HELLO, WORLD!  "

        // String trim()
        System.out.println("trim(): \"" + str.trim() + "\""); // "Hello, World!"

        // static String format(String format, Object... args)
        String formatted = String.format("Number: %d, String: %s", 42, "Java");
        System.out.println("format(): " + formatted); // "Number: 42, String: Java"
    }

}


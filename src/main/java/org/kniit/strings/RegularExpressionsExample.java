package org.kniit.strings;

import java.util.regex.Pattern;

public class RegularExpressionsExample {

    public static void main(String[] args) {
        System.out.println(isValidPhone("+12223334444"));
        System.out.println(isValidPhone("89123456789"));
        System.out.println(isValidPhone("+79123456789"));
        System.out.println(isValidPhone("123-45-678"));
        System.out.println(isRusValidPhone("+12223334444"));
        System.out.println(isRusValidPhone("89123456789"));
        System.out.println(isRusValidPhone("+79123456789"));
        System.out.println(isRusValidPhone("123-45-678"));
    }

    public static boolean isValidPhone(String phone) {
        return Pattern.matches("^\\+?[1-9][0-9]{7,14}$", phone);
    }

    public static boolean isRusValidPhone(String phone) {
        return Pattern.matches("^\\+?[7|8]\\d{10}$", phone);
    }

}

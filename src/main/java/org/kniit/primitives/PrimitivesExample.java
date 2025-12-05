package org.kniit.primitives;

public class PrimitivesExample {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        char c = 'A';    // 65
        int i = 100;
        long l = 1000L;
        float f = 1.5f;
        double d = 2.5;

        // byte + short => int
        var byteShort = b + s;
        System.out.println("byte + short = " + byteShort + " (тип: " + ((Object)byteShort).getClass().getSimpleName() + ")");

        // byte + char => int
        var byteChar = b + c;
        System.out.println("byte + char = " + byteChar + " (тип: " + ((Object)byteChar).getClass().getSimpleName() + ")");

        // short + char => int
        var shortChar = s + c;
        System.out.println("short + char = " + shortChar + " (тип: " + ((Object)shortChar).getClass().getSimpleName() + ")");

        // int + char => int
        var intChar = i + c;
        System.out.println("int + char = " + intChar + " (тип: " + ((Object)intChar).getClass().getSimpleName() + ")");

        // int + long => long
        var intLong = i + l;
        System.out.println("int + long = " + intLong + " (тип: " + ((Object)intLong).getClass().getSimpleName() + ")");

        // long + float => float
        var longFloat = l + f;
        System.out.println("long + float = " + longFloat + " (тип: " + ((Object)longFloat).getClass().getSimpleName() + ")");

        // float + double => double
        var floatDouble = f + d;
        System.out.println("float + double = " + floatDouble + " (тип: " + ((Object)floatDouble).getClass().getSimpleName() + ")");

        // short + float => float
        var shortFloat = s + f;
        System.out.println("short + float = " + shortFloat + " (тип: " + ((Object)shortFloat).getClass().getSimpleName() + ")");

        // int + double => double
        var intDouble = i + d;
        System.out.println("int + double = " + intDouble + " (тип: " + ((Object)intDouble).getClass().getSimpleName() + ")");
    }
}


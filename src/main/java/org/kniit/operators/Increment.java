package org.kniit.operators;

public class Increment {

    public static void main(String[] args) {
        System.out.println("Инкремент");
        int i = 1;
        System.out.println("i = " + i);
        System.out.println("++i = " + ++i);
        System.out.println("i++ = " + i++);

        System.out.println("i = " + i);
        System.out.println("--i = " + --i);
        System.out.println("i-- = " + i--);
        System.out.println("i = " + i);
        System.out.println("--------------------");

        i+=2; // i = i + 2
        System.out.println("i = " + i);
        i*=2; // i = i * 2
        System.out.println("i = " + i);

        System.out.println("--------------------");
        System.out.println("Сдвиг");
        System.out.println("i = " + Integer.toBinaryString(i));
        i <<= 2;
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("i = " + i);

        System.out.println("-------------------");

        i = 13;
        System.out.println("i = " + Integer.toBinaryString(i));

        i >>= 2;
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("i = " + i);

        System.out.println("-------------------");

        System.out.println("Поразрядные");
        i = 1;
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("i = " + Integer.toBinaryString(~i));
        System.out.println("i = " + ~i);
        System.out.println("-------------------");

        System.out.println("Тернарный оператор");
        i = 1;
        int t = i == 1 ? 2 : 3;
        System.out.println(t);

    }
}

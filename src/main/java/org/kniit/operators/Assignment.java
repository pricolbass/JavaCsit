package org.kniit.operators;

public class Assignment {

    public static void main(String[] args) {
        int i1 = 1, i2 = 2;
        System.out.println("i1 = " + i1 + ", i2 = " + i2);

        i1 = i2;
        System.out.println("i1 = " + i1 + ", i2 = " + i2);

        i1 = 4;
        System.out.println("i1 = " + i1 + ", i2 = " + i2);
        System.out.println("----------------------------");

        Wrap w1 = new Wrap();
        Wrap w2 = new Wrap();

        w1.i = 1;
        w2.i = 2;

        System.out.println("w1 = " + w1.i + ", w2 = " + w2.i);

        w1 = w2;
        System.out.println("w1 = " + w1.i + ", w2 = " + w2.i);

        w1.i = 4;
        System.out.println("w1 = " + w1.i + ", w2 = " + w2.i);

        increment(w1.i);
        System.out.println("w1 = " + w1.i);

        increment(w1);
        System.out.println("w1 = " + w1.i);


    }

    static void increment(int value) {
        value = value + 1;
    }

    static void increment(Wrap value) {
        value.i = value.i + 1;
    }

    static class Wrap {
        int i;
    }
}



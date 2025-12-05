package org.kniit.operators;

public class Precedence {
    public static void main(String[] args) {
        int x = 10, у = 20, z = 30;
        float a = (x + (у + 2))/(2 + z);
        float b = x + (у + 2)/(2 + z);
        System.out.println("a = " + a + ", b = " + b);
    }
}

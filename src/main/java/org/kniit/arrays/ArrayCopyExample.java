package org.kniit.arrays;

import java.util.Arrays;
import java.util.Comparator;

class ArrayCopyExample {
    public static void main(String[] args) {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
            "Marocchino", "Ristretto" };
        System.out.println("================= Копирование ====================");
        String[] copyRange = Arrays.copyOfRange(copyFrom, 4, 9);
        for (String coffee : copyRange) {
            System.out.print(coffee + " ");
        }
        System.out.println("\n================= Сравнение ====================");

        String[] copyTo = Arrays.copyOf(copyFrom, copyFrom.length);
        System.out.println(copyFrom == copyTo);
        System.out.println(Arrays.equals(copyFrom, copyTo));


        System.out.println("================= Сортировка ====================");

        Arrays.sort(copyFrom, Comparator.reverseOrder());
        for (String coffee : copyFrom) {
            System.out.print(coffee + " ");
        }
    }
}

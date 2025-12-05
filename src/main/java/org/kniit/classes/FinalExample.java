package org.kniit.classes;

import java.util.Arrays;

// Пример с final-переменной (константа)
public class FinalExample {
    public static void main(String[] args) {
        final double PI = 3.14159; // Значение нельзя изменить
        System.out.println("Value of PI: " + PI);

        // Следующая строка вызовет ошибку компиляции:
        // PI = 3.15;
        System.out.println("-----------------------------");
        final int[] array = new int[2];
        System.out.println("Element at index 0: " + array[0]);
        System.out.println("Element at index 1: " + array[1]);

        array[1] = 2;
        System.out.println("-----------------------------");
        System.out.println("Element at index 0: " + array[0]);
        System.out.println("Element at index 1: " + array[1]);
    }
}

// Пример с final-методом
class Animal {
    final void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // Попытка переопределить метод вызовет ошибку компиляции:
    // void makeSound() { System.out.println("Bark"); }
}

// Пример с final-классом
final class MathConstants {
    final double E = 2.71828;
}

// Следующее приведёт к ошибке компиляции:
// class CustomMath extends MathConstants {}


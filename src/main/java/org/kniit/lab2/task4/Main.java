package org.kniit.lab2.task4;

public class Main {
    public static void main(String[] args) {
        Container container = new Container(1000);  // Создаем контейнер с объемом 1000

        Shape sphere = new Sphere(5);   // Создаем сферу с радиусом 5
        Shape cube = new Cube(3);       // Создаем куб со стороной 3
        Shape cylinder = new Cylinder(2, 5); // Создаем цилиндр с радиусом 2 и высотой 5

        System.out.println("Объем сферы: " + sphere.getVolume());
        System.out.println("Объем куба: " + cube.getVolume());
        System.out.println("Объем цилиндра: " + cylinder.getVolume());

        container.add(sphere);  // Проверяем, можно ли добавить сферу
        container.add(cube);    // Проверяем, можно ли добавить куб
        container.add(cylinder); // Проверяем, можно ли добавить цилиндр

        System.out.println("Использованный объем: " + container.getUsedVolume());
        System.out.println("Свободный объем: " + container.getFreeVolume());
    }
}
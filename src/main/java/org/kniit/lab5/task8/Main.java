package org.kniit.lab5.task8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] names = {"книга", "ручка", "линейка", "пенал", "тетрадь", "карандаш", "ластик", "циркуль"};
        Random random = new Random();

        // Создаем 100 объектов ShopItem
        ShopItem[] testData = new ShopItem[100];
        for (int i = 0; i < 100; i++) {
            String name = names[random.nextInt(names.length)];
            int price = random.nextInt(1) + 10; // Цена от 10 до 11 (для показания коллизий)
            int quantity = random.nextInt(100) + 1; // Количество от 1 до 100
            testData[i] = new ShopItem(name, price, quantity);
        }

        System.out.println("Исходный массив");
        for (int i = 0; i < 10; i++) { // Выводим первые 10 для примера
            System.out.println(testData[i]);
        }

        // Сортируем по цене с использованием компаратора
        Arrays.sort(testData, Comparator.comparingInt(ShopItem::getPrice));

        System.out.println("\nОтсортированный массив по цене");
        for (int i = 0; i < 10; i++) { // Выводим первые 10 для примера
            System.out.println(testData[i]);
        }

        // Выводим все объекты
        System.out.println("\nВсе объекты:");
        for (ShopItem item : testData) {
            System.out.println(item);
        }

        // Подсчитываем количество одинаковых ShopItem
        Set<ShopItem> uniqueItems = new HashSet<>();
        for (ShopItem item : testData) {
            uniqueItems.add(item);
        }

        int duplicateCount = testData.length - uniqueItems.size();

        System.out.println("\nСтатистика");
        System.out.println("Всего объектов: " + testData.length);
        System.out.println("Уникальных объектов: " + uniqueItems.size());
        System.out.println("Количество дубликатов: " + duplicateCount);

    }
}
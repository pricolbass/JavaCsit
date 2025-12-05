package org.kniit.lab5.task9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        List<String> words = getWords("misc/dictionary.txt");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        long startTime = System.currentTimeMillis();
        long endTime = startTime + 60000; // 60 секунд = 60000 миллисекунд

        int totalWords = 0;
        int correctWords = 0;

        System.out.println("Тест скорости ввода слов");

        while (System.currentTimeMillis() < endTime) {
            String randomWord = words.get(random.nextInt(words.size()));
            System.out.println("Введите слово: " + randomWord);

            String userInput = scanner.nextLine().trim();
            totalWords++;

            if (userInput.equals(randomWord)) {
                correctWords++;
                System.out.println("Правильно!");
            } else {
                System.out.println("Неправильно. Правильный ответ: " + randomWord);
            }

            // Проверяем, не закончилось ли время
            if (System.currentTimeMillis() >= endTime) {
                break;
            }
        }

        System.out.println("\nРезультаты");
        System.out.println("Всего слов: " + totalWords);
        System.out.println("Правильных слов: " + correctWords);
        System.out.println("Процент правильных ответов: " +
                String.format("%.2f", (double) correctWords / totalWords * 100) + "%");

        scanner.close();
    }

    // Возвращает список слов из файла
    public static List<String> getWords(String path) {
        List<String> words = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine().trim();
                if (!word.isEmpty()) {
                    words.add(word);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл В С Ё" + e.getMessage());
        }
        return words;
    }
}
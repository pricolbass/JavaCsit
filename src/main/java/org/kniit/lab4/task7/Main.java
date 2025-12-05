package org.kniit.lab4.task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Читаем слова из файла
            ArrayList<String> wordList = new ArrayList<>();
            Scanner scanner = new Scanner(new File("misc/dictionary.txt"));

            while (scanner.hasNext()) {
                String word = scanner.nextLine().trim();
                if (!word.isEmpty()) {
                    wordList.add(word);
                }
            }
            scanner.close();

            // Преобразуем в массив
            String[] words = wordList.toArray(new String[0]);

            // Создаем алфавит (для русского языка)
            char[] alphabet = {
                    'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м',
                    'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ',
                    'ы', 'ь', 'э', 'ю', 'я'
            };

            // Создаем объект статистики
            DictionaryStatistic statistic = new DictionaryStatistic(words, alphabet);

            // Выводим статистику
            System.out.println("Размер словаря: " + statistic.getDictionarySize());
            System.out.println("Количество палиндромов: " + statistic.getPolindrom());
            System.out.println("Максимальная длина слова: " + statistic.getMaxWordLength());
            System.out.println("Минимальная длина слова: " + statistic.getMinWordLength());

            // Выводим статистику по буквам
            statistic.printSymbolsStat();

            // Выводим несколько случайных слов
            System.out.println("\nСлучайные слова из словаря:");
            for (int i = 0; i < 5; i++) {
                System.out.println(statistic.getRandomWord());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Мне надо было добавить исключение чтобы не вылетала ошибка компиляции\n" + e.getMessage());
        }
    }
}
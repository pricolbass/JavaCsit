package org.kniit.lab4.task7;

import java.util.Random;

public class DictionaryStatistic {
    private String[] words;
    private int dictionarySize; // Количество слов
    private int polindrom; // Количество слов полиндромов
    private int maxWordLength; // максимальная длина слова в словаре
    private int minWordLength; // минимальная длина слова в словаре
    private char[] alphabet; // буквы алфавита
    private int[] frequency; // частота букв в словаре (в каждой ячейке хранит частоту букв, а индекс - это позиция буквы в alphabet)

    public DictionaryStatistic(String[] words, char[] alphabet) {
        this.words = words;
        this.alphabet = alphabet;
        this.dictionarySize = words.length;

        // Инициализируем массив частот
        this.frequency = new int[alphabet.length];

        // Вычисляем статистику
        calculateStatistics();
    }

    private void calculateStatistics() {
        // Вычисляем максимальную и минимальную длину слова
        if (words.length > 0) {
            maxWordLength = words[0].length();
            minWordLength = words[0].length();
        } else {
            maxWordLength = 0;
            minWordLength = 0;
        }

        // Подсчитываем количество палиндромов
        polindrom = 0;

        // Подсчитываем частоту букв
        for (String word : words) {
            if (word.length() > maxWordLength) {
                maxWordLength = word.length();
            }
            if (word.length() < minWordLength) {
                minWordLength = word.length();
            }

            if (isPalindrome(word)) {
                polindrom++;
            }

            // Подсчитываем частоту букв
            countLetterFrequency(word);
        }
    }

    private void countLetterFrequency(String word) {
        String lowerWord = word.toLowerCase();
        for (char c : lowerWord.toCharArray()) {
            for (int i = 0; i < alphabet.length; i++) {
                if (Character.toLowerCase(alphabet[i]) == c) {
                    frequency[i]++;
                    break;
                }
            }
        }
    }

    private boolean isPalindrome(String word) {
        String lowerWord = word.toLowerCase();
        int left = 0;
        int right = lowerWord.length() - 1;

        while (left < right) {
            if (lowerWord.charAt(left) != lowerWord.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // получить случайное слово из словаря
    public String getRandomWord() {
        if (words.length == 0) {
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(words.length);
        return words[index];
    }

    public void printSymbolsStat() {
        System.out.println("Статистика по буквам:");
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i] + " - " + frequency[i]);
        }
    }

    // Геттеры
    public String[] getWords() {
        return words;
    }

    public int getDictionarySize() {
        return dictionarySize;
    }

    public int getPolindrom() {
        return polindrom;
    }

    public int getMaxWordLength() {
        return maxWordLength;
    }

    public int getMinWordLength() {
        return minWordLength;
    }

    public char[] getAlphabet() {
        return alphabet;
    }

    public int[] getFrequency() {
        return frequency;
    }
}
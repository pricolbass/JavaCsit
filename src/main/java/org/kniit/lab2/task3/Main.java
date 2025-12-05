package org.kniit.lab2.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Консольный калькулятор. Введите 'exit' для выхода.");

        while (true) {
            System.out.print("Введите первое число: ");
            String input1 = scanner.nextLine().trim();

            if (input1.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            }

            double num1;
            try {
                num1 = Double.parseDouble(input1);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено некорректное число.");
                continue;
            }

            System.out.print("Введите оператор (+, -, *, /): ");
            String operator = scanner.nextLine().trim();

            System.out.print("Введите второе число: ");
            String input2 = scanner.nextLine().trim();

            if (input2.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            }

            double num2;
            try {
                num2 = Double.parseDouble(input2);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено некорректное число.");
                continue;
            }

            double result;
            try {
                switch (operator) {
                    case "+":
                        result = calculator.add(num1, num2);
                        break;
                    case "-":
                        result = calculator.subtract(num1, num2);
                        break;
                    case "*":
                        result = calculator.multiply(num1, num2);
                        break;
                    case "/":
                        result = calculator.divide(num1, num2);
                        break;
                    default:
                        System.out.println("Ошибка: неподдерживаемый оператор. Используйте +, -, *, /");
                        continue;
                }

                System.out.println("Результат: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
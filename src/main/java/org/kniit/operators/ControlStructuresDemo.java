package org.kniit.operators;

public class ControlStructuresDemo {

    public static void main(String[] args) {
        // if-else
        int number = 5;
        if (number % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
        System.out.println("\n ======================");


        // while
        int count = 0;
        System.out.print("while: ");
        while (count < 3) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println("\n ======================");


        // do-while
        int n = 0;
        System.out.print("do-while: ");
        do {
            System.out.print(n + " ");
            n++;
        } while (n < 2);
        System.out.println("\n ======================");


        // for
        System.out.print("for: ");
        for (int i = 0; i < 3; i++) {
            if (i == 2) break;         // break example
            if (i == 1) continue;      // continue example
            System.out.print(i + " ");
        }
        System.out.println("\n ======================");

        System.out.println("Неполный for");
        int g = 0;
        for (; g < 2; ) {
            System.out.print(g + " ");
            g++;
        }

        System.out.println("\n ======================");

        System.out.println("for i + j");
        for (int i = 0, j = i + 5; i < 3; i++, j *= 2) {
            System.out.println(i + " " + j );
        }
        System.out.println("\n ======================");

        // foreach (for-each)
        int[] nums = {10, 20, 30};
        System.out.print("foreach: ");
        for (int value : nums) {
            System.out.print(value + " ");
        }
        /*
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        */
        System.out.println("\n ======================");



        // return
        int res = sumFirstTwo(nums);
        System.out.println("return: сумма первых двух элементов массива = " + res);
    }

    public static int sumFirstTwo(int[] arr) {
        // return example: возвращает сумму первых двух элементов
        if (arr.length < 2) {
            return 0;
        }
        return arr[0] + arr[1];
    }
}

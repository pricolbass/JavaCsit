package org.kniit.arrays;

public class ArrayExample {

    public static void main(String[] args) {
        int[] anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: " + anArray[6]);
        System.out.println("Element at index 7: " + anArray[7]);
        System.out.println("Element at index 8: " + anArray[8]);
        System.out.println("Element at index 9: " + anArray[9]);
        System.out.println("Length: " + anArray.length);

        System.out.println("=======================");
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Element at index 0: " + array2[0]);
        System.out.println("Element at index 1: " + array2[1]);
        System.out.println("Element at index 2: " + array2[2]);
        System.out.println("Element at index 3: " + array2[3]);
        System.out.println("Element at index 4: " + array2[4]);
        System.out.println("Element at index 5: " + array2[5]);
        System.out.println("Element at index 6: " + array2[6]);
        System.out.println("Element at index 7: " + array2[7]);
        System.out.println("Element at index 8: " + array2[8]);
        System.out.println("Element at index 9: " + array2[9]);

        System.out.println("========== Многомерные массивы ================");
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][1]);

        int[][] multyArray = new int[2][2];
        System.out.println("==============================");

        multyArray[0] = new int[]{ 100, 200 };
        multyArray[1] = new int[]{ 300, 400 };

        System.out.println(multyArray[0][0]);
        System.out.println(multyArray[0][1]);
        System.out.println(multyArray[1][0]);
        System.out.println(multyArray[1][1]);
    }

}

package org.kniit.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaExample {

    static int intField = 1;

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };

        Runnable lambda = () -> System.out.println("Hello from lambda");

        r.run();
        lambda.run();

        Integer[] ints = {1, 2, 3};
        Long[] longs = {1L, 2L};

        Comparator<Integer> integerComparator = (i1, i2) -> {
            if (i1 < i2) {
                return 1;
            } else if (i1 > i2) {
                return -1;
            } else {
                return 0;
            }
        };
        Arrays.sort(ints, integerComparator);

        int effectiveFinal = 1;

        Function<Integer, Integer> mult = (n) -> n * 3;

        System.out.println(mult.apply(effectiveFinal));

//        Runnable mult2 = () -> effectiveFinal = effectiveFinal * 3;

        Runnable mult3 = () -> intField++;

    }


}

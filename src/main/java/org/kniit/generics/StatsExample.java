package org.kniit.generics;

public class StatsExample {

    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
//        double v = iob.average();
//        System.out.println("Cpeднee значение i ob равно " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
//        double w = dob.average();
//        System.out.println(" Cpeднee значение dob равно " + w);
//
        System.out.println(iob.isSameAvg(dob));

//        String[] strings = {"a", "b"};
//        Stats<String> stringStats = new Stats<>(strings);
//        System.out.println(iob.isSameAvg(stringStats));

//        Stats stats = new Stats(new Object[]{4});
//        stats = dob;
    }

}


class Stats<T extends Number> {
    T[] nums;
    Stats(T[] o) {
        nums = o;
    }
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum;
    }

    boolean isSameAvg(Stats<?> ob) {
        if (average() == ob.average())
            return true;
        return false;
    }

}

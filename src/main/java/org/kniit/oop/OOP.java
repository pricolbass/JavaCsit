package org.kniit.oop;

public class OOP {

    public static void main(String[] args) {
        Car car = new Car("Blue", "A", "B");
        car.drive();
        System.out.println(car.toString());
        car = new Sedan("Blue", "A", "B");
        car.drive();
        car = new Coupe("Blue", "A", "B");
        car.drive();
    }

}


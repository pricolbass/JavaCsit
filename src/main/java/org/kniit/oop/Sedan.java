package org.kniit.oop;

public class Sedan extends Car {

    private int doors = 4; // Количество дверей
    private String bodyType; // Тип кузова

    public Sedan(String color, String brand, String model) {
        super(color, brand, model);
    }

    public Sedan(String color, String brand, String model, String bodyType) {
        super(color, brand, model);
        this.bodyType = bodyType;
    }

    @Override
    void drive() {
        System.out.println("Sedan drive");
    }

}

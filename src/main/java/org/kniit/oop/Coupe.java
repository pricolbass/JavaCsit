package org.kniit.oop;

public class Coupe extends Car {
    private String bodyType; // Тип кузова

    public Coupe(String color, String brand, String model) {
        super(color, brand, model);
    }

    public Coupe(String color, String brand, String model, String bodyType) {
        super(color, brand, model);
        this.bodyType = bodyType;
    }

    @Override
    void drive() {
        System.out.println("Coupe drive");
    }

}

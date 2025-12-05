package org.kniit.oop;

import java.util.Objects;

public class Car {

    private String color; // Цвет автомобиля
    private String brand; // Марка автомобиля
    private String model; // Модель автомобиля

    public Car(String color, String brand, String model) {
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    void drive() {
        System.out.println("Car drive");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Проверка на сравнение самого объекта с собой
        if (obj == null || getClass() != obj.getClass()) return false;  // Проверка на null и тип объекта

        Car car = (Car) obj;  // Приведение типа
        return this.color.equals(car.color)
            && this.brand.equals(car.brand)
            && this.model.equals(car.model);  // Сравнение полей
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, brand, model); // Генерация хэш-кода на основе значений полей
    }

    @Override
    public String toString() {
        return "Car{" +
            "color=" + color +
            ", brand=" + brand +
            ", model=" + model +
            "}";
    }

}

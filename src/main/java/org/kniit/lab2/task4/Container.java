package org.kniit.lab2.task4;

public class Container {
    private double totalVolume;
    private double usedVolume;

    public Container(double totalVolume) {
        this.totalVolume = totalVolume;
        this.usedVolume = 0;
    }

    public boolean add(Shape shape) {
        double shapeVolume = shape.getVolume();
        double freeVolume = totalVolume - usedVolume;

        if (shapeVolume <= freeVolume) {
            usedVolume += shapeVolume;
            System.out.println("Фигура добавлена. Объем фигуры: " + shapeVolume +
                    ", свободный объем: " + (freeVolume - shapeVolume));
            return true;
        } else {
            System.out.println("Невозможно добавить фигуру. Недостаточно места. " +
                    "Объем фигуры: " + shapeVolume +
                    ", доступный объем: " + freeVolume);
            return false;
        }
    }

    public double getFreeVolume() {
        return totalVolume - usedVolume;
    }

    public double getUsedVolume() {
        return usedVolume;
    }

    public double getTotalVolume() {
        return totalVolume;
    }
}
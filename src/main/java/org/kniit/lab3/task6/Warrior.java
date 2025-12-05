package org.kniit.lab3.task6;

public class Warrior extends Player implements Attackable {

    public Warrior(String name) {
        super(name, 150, 25, 15); // Воины имеют много здоровья и защиты
    }

    @Override
    public void attack(Player player) {
        if (isAlive && player.isAlive()) {
            System.out.println(name + " атакует " + player.getName());
            player.decreaseHealth(damage);
            System.out.println("Нанесённый урон: " + damage);
        } else {
            System.out.println("Невозможно выполнить атаку");
        }
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", currentHealth=" + currentHealth +
                ", maxHealth=" + maxHealth +
                ", isAlive=" + isAlive +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                ", damage=" + damage +
                ", defense=" + defense +
                '}';
    }
}
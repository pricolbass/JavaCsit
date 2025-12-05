package org.kniit.lab3.task6;

public class Priest extends Player implements Healable {
    private final int healPower;

    public Priest(String name) {
        super(name, 100, 10, 10); // Священники имеют среднее здоровье и защиту
        this.healPower = 30;
    }

    @Override
    public void heal(Player player) {
        if (isAlive && player.isAlive()) {
            System.out.println(name + " лечит " + player.getName());
            player.increaseHealth(healPower);
            System.out.println("Лечение: " + healPower);
        } else {
            System.out.println("Невозможно применить лечение");
        }
    }

    @Override
    public String toString() {
        return "Priest{" +
                "name='" + name + '\'' +
                ", currentHealth=" + currentHealth +
                ", maxHealth=" + maxHealth +
                ", isAlive=" + isAlive +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                ", damage=" + damage +
                ", defense=" + defense +
                ", healPower=" + healPower +
                '}';
    }
}
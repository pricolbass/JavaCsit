package org.kniit.lab3.task6;

public class WarriorGuard extends Warrior {
    private final int additionalDefense;

    public WarriorGuard(String name) {
        super(name);
        this.additionalDefense = 10; // Дополнительная защита для танка
        // Увеличиваем защиту за счёт дополнительной защиты
        setDefense(getDefense() + additionalDefense);
    }

    @Override
    public void decreaseHealth(int value) {
        int totalDefense = getDefense();
        int actualDamage = value - totalDefense;
        if (actualDamage < 0) {
            actualDamage = 0;
        }
        setCurrentHealth(getCurrentHealth() - actualDamage);
    }

    @Override
    public String toString() {
        return "WarriorGuard{" +
                "name='" + name + '\'' +
                ", currentHealth=" + currentHealth +
                ", maxHealth=" + maxHealth +
                ", isAlive=" + isAlive +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                ", damage=" + damage +
                ", defense=" + defense +
                ", additionalDefense=" + additionalDefense +
                '}';
    }
}
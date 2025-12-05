package org.kniit.lab3.task6;

public class Mage extends Player implements Magical {
    private final int spellPower;

    public Mage(String name) {
        super(name, 80, 20, 5); // Маги обычно имеют меньше здоровья и защиты
        this.spellPower = 25;
    }

    @Override
    public void castSpell(Player player) {
        if (isAlive && player.isAlive()) {
            System.out.println(name + " бросает заклинание на " + player.getName());
            player.decreaseHealth(spellPower);
            System.out.println("Урон от заклинания: " + spellPower);
        } else {
            System.out.println("Невозможно использовать заклинание");
        }
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                ", currentHealth=" + currentHealth +
                ", maxHealth=" + maxHealth +
                ", isAlive=" + isAlive +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                ", damage=" + damage +
                ", defense=" + defense +
                ", spellPower=" + spellPower +
                '}';
    }
}
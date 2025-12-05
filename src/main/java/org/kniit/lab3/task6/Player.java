package org.kniit.lab3.task6;

public abstract class Player {
    protected String name;
    protected int currentHealth;
    protected int maxHealth;
    protected boolean isAlive;
    protected int positionX;
    protected int positionY;
    protected int damage;
    protected int defense;

    public Player(String name, int maxHealth, int damage, int defense) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.isAlive = true;
        this.positionX = 0;
        this.positionY = 0;
        this.damage = damage;
        this.defense = defense;
    }

    public void increaseHealth(int value) {
        if (isAlive) {
            currentHealth += value;
            if (currentHealth > maxHealth) {
                currentHealth = maxHealth;
            }
        }
    }

    public void decreaseHealth(int value) {
        int actualDamage = value - defense;
        if (actualDamage < 0) {
            actualDamage = 0;
        }
        currentHealth -= actualDamage;
        if (currentHealth <= 0) {
            currentHealth = 0;
            isAlive = false;
        }
    }

    public void move(int x, int y) {
        positionX = x;
        positionY = y;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
        if (currentHealth <= 0) {
            this.currentHealth = 0;
            this.isAlive = false;
        } else if (currentHealth > maxHealth) {
            this.currentHealth = maxHealth;
        }
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
        if (currentHealth > maxHealth) {
            currentHealth = maxHealth;
        }
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Player{" +
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
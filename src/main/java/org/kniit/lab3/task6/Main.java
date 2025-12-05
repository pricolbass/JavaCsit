package org.kniit.lab3.task6;

public class Main {
    public static void main(String[] args) {
        WarriorGuard warrior = new WarriorGuard("Some Ork");
        Mage mage = new Mage("Some Mage");
        Priest priest = new Priest("Some Healer");

        System.out.println("Начальные характеристики");
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(priest);

        System.out.println("\nВоин атакует мага");
        warrior.attack(mage);
        System.out.println("Состояние мага после атаки:");
        System.out.println(mage);

        System.out.println("\nСвященник лечит мага");
        priest.heal(mage);
        System.out.println("Состояние мага после лечения:");
        System.out.println(mage);

        System.out.println("\nМаг бросает заклинание на воина");
        mage.castSpell(warrior);
        System.out.println("Состояние воина после заклинания:");
        System.out.println(warrior);

        System.out.println("\nПовторная атака мага на воина");
        mage.castSpell(warrior);
        System.out.println("Состояние воина после повторной атаки:");
        System.out.println(warrior);

        System.out.println("\nИтоговое состояние всех персонажей");
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(priest);


    }
}
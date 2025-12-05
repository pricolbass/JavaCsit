package org.kniit.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CovarianceExample {

    public static void main(String[] args) {
        Animal animal = new Tiger();
        Animal[] animals = new Predator[0];

        List<Lion> lions = new ArrayList<>();
        List<? extends Predator> animalList = lions;
        get(lions);
//        addLion(lions);
//        addLion(new ArrayList<Tiger>());
//        addLion(new ArrayList<Mammal>());
    }

    private static void get(List<? extends Predator> predators) {
        System.out.println(predators.get(0));
        predators.add(null);
    }

    private static void addLion(List<? super Predator> predators) {
        Lion lion = new Lion();
        predators.add(lion);
        Object predator = predators.get(0);
    }

}

class Animal {}

class Mammal extends Animal {}

class Predator extends Mammal {}

class Tiger extends Predator {}

class Lion extends Predator {}

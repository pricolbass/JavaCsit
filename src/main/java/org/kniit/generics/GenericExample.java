package org.kniit.generics;

public class GenericExample {

    public static void main(String[] args) {

    }

    class Basket {

    }

    class Cat {
        private final String name;

        Cat(String name) {this.name = name;}


        public String getName() {
            return name;
        }
    }

    class Apple {
        private final String sortName;

        Apple(String sortName) {this.sortName = sortName;}

        public String getSortName() {
            return sortName;
        }
    }
}

package org.kniit.st;

public class InitExample {
    public static void main(String[] args) {
        new Child();
        System.out.println("--- второй объект ---");
        new Child();
    }
}

class Parent {
    static { System.out.println("Parent static"); }
    { System.out.println("Parent instance"); }
    Parent() { System.out.println("Parent constructor"); }
}

class Child extends Parent {
    static { System.out.println("Child static"); }
    { System.out.println("Child instance"); }
    Child() { System.out.println("Child constructor"); }
}


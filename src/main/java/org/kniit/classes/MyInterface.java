package org.kniit.classes;

public interface MyInterface {

    String FIELD = "SOME_TEXT";

    void doSmth();

    default void doSmthDefault() {
        System.out.println("default do smth");
    }

    static void doSmthStatic() {
        System.out.println("static do smth");
    }
}

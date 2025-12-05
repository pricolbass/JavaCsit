package org.kniit.classes;

public class ButtonExample {

    public static void main(String[] args) {
        System.out.println("=================== Local class example =============");

        class LocalClass {
            public void doSmth() {
                System.out.println("local do smth");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.doSmth();

        System.out.println("=================== Anonymous class example =============");
        Button openButton = new Button() {
            @Override
            public void press() {
                System.out.println("Opening file!");
            }
        };

        Button saveButton = new Button() {
            @Override
            public void press() {
                System.out.println("Saving file!");
            }
        };

        openButton.press();
        saveButton.press();



    }
}

// Base class
interface Button {
    void press();
}


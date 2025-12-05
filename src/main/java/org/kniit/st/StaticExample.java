package org.kniit.st;

public class StaticExample {

    public static void main(String[] args) {
        System.out.println(StaticHolder.i);

        StaticHolder sh1 = new StaticHolder();
        System.out.println(sh1.i);

        StaticHolder sh2 = new StaticHolder();
        System.out.println(sh2.i);

    }

}

class StaticHolder {

    public static int i;

    static {
        i = 2;
    }

    public StaticHolder() {
        i++;
    }

}

package org.kniit.classes;

public abstract class MyAbstractClass {
    private String field;

    protected MyAbstractClass(String field) {this.field = field;}

    public void doSuperSmth() {
        System.out.println("super do smth");
    }

    public final void doSmthFinal() {
        System.out.println("super do smth final");
    }

    abstract void doAbstractSmth();

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

}

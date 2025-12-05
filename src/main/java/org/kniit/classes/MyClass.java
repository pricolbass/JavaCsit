package org.kniit.classes;

public class MyClass extends MyAbstractClass implements MyInterface {

    private MyAnotherClass myAnotherClass;

    public MyClass() {super("");}

    public MyClass(MyAnotherClass myAnotherClass) {
        super("");
        this.myAnotherClass = myAnotherClass;
    }

    protected MyClass(MyAnotherClass myAnotherClass, String field) {
        super(field);
        this.myAnotherClass = myAnotherClass;
    }

    public MyAnotherClass getMyAnotherClass() {
        return myAnotherClass;
    }

    public void setMyAnotherClass(MyAnotherClass myAnotherClass) {
        this.myAnotherClass = myAnotherClass;
    }

    @Override
    public void doSmth() {
        System.out.println("do smth");
    }

    @Override
    void doAbstractSmth() {
        System.out.println("do abstract smth");
    }

    @Override
    public void doSmthDefault() {
        System.out.println("do static smth in class");
    }

    /*
    public final void doSmthFinal() { // не компилируется
        System.out.println("super do smth final");
    }
    */


}

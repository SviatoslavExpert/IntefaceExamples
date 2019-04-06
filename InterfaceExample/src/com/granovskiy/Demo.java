package com.granovskiy;

public class Demo {

    public void printString(SomeInterface sI) {
        System.out.println(sI.makeString());
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        SomeInterface sI = new SomeInterfaceImpl();
        d.printString(sI);
    }
}

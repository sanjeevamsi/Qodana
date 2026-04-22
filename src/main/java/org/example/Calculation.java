package org.example;

public class Calculation {

    public int divide(int a, int b) {
        return a / b;
    }

    public void nullPointer() {
        String s = null;
        System.out.println(s.length());
    }

    public int calculate (int x) {
        int unused = x * 42;
        return x + 1;
    }
}

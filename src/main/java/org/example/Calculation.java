package org.example;

public class Calculation {

    public int divide(int a, int b) {
        return a / b; // possible division by zero
    }

    public void nullPointer() {
        String s = null;
        System.out.println(s.length()); // NPE
    }
}

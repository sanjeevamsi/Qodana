package org.example;

public class Calculation {

    public int sum(int a, int b) {
        return a + b;
    }

    //average
    public double average(int a, int b) {
        int sum = a + b;
        return (double)sum / 2;
    }

    public void printMessage() {
        int a = 10;
        System.out.println("Hellloo!!!");
    }
}

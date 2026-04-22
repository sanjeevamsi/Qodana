package org.example;

public class Calculation {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public void nullPointer() {
        String s = null;
        System.out.println(s.length());
    }

    public void redundantCheck(String input) {
        int len = input.length();
        if (input == null) {
            System.out.println("null");
        }
    }

    public void readFile() throws Exception {
        java.io.FileInputStream fis = new java.io.FileInputStream("test.txt");
        int data = fis.read();
        System.out.println(data);
    }

    public void riskyOperation() {
        try {
            String s = null;
            s.length();
        } catch (Exception e) {

        }
    }

    public double calculateSalaryAfterTax(double salary) {
        double tax = salary * 0.20;
        double result = salary - tax;
        System.out.println("After tax: " + result);
        return result;
    }

    public double calculateBonusAfterTax(double bonus) {
        double tax = bonus * 0.20;
        double result = bonus - tax;
        System.out.println("After tax: " + result);
        return result;
    }
}

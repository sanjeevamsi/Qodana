package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculation c = new Calculation();
        int a = c.sum(10,20);
        System.out.println(a);
        double d = c.average(10,20);
        System.out.println(d);
        c.printMessage();
    }
}

package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        var numberDoubled = number * 2;
        return numberDoubled;
    }

    private static int add(int[] numbers){
        var sum = 0;

        for(var item: numbers){
            sum += item;
        }

        return sum;
    }
}


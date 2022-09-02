package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int firstVar = 10;
        int secondVar = 15;
        System.out.println("firstVar = " + firstVar);
        System.out.println("secondVar = " + secondVar);
        //first method
       /* secondVar = secondVar - 5;
        firstVar = firstVar + 5; */
        // method two
        int tempVar = secondVar;
        secondVar = firstVar;
        firstVar = tempVar;
        System.out.println("firstVar = " + firstVar);
        System.out.println("secondVar = " + secondVar);
    }
}

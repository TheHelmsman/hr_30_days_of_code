/*
 * Copyright 2016
 */

package genericschallenge;

/**
 * @author Mikromafia
 */
public class Printer {
    
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }
}

package arraypractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {

    //  public static <E, T> E[] printArray(E[] array, T b) {
    public static <E> void printArray(E[] array) {
        for(E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        //  return array;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //  Index:  0  1  2  3  4
        //  Array: [0, 5, 3, 2, 1] --> length 5
        
        //  Random Objects from Array
        //  Math.abs(rand.nextInt) % length;
        
        //  Index:   0       1       2
        //  Array: ["bob", "bobby", "max"] --> length 3
        
        //  Declaring, Allocating and Initializing
        Integer[] intArray1;
        Integer[] intArray2 = new Integer[4];
        printArray(intArray2);
        Integer[] intArray3 = {5, 2, 9, 1, 3};
        
        String[] shoppingList = {"bananas", "apples", "pears"};
        
        //  Index:  0  1  2  3
        //  Array: [10, 8, 5, 10] --> length 4
        
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;
        
        //  Print out Arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();
        
        //  Custom print out arrays
        printArray(intArray2);
        printArray(intArray3);
        
        //  Retrieve objects
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2, 3));
        System.out.println();
        
        //  Given functions
        Arrays.sort(intArray3);
        printArray(intArray3);
        
        //  Print string array
        printArray(shoppingList);
        
        //  Special for loop foreach
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }
    
}

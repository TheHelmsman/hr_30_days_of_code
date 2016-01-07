package arithmetic;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public double calcTip(double m, int t) {
        
        return m * t / 100;
    }
    
    public double calcTax(double m, int x) {
        
        return m * x / 100;
    }
    
    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
        
      Arithmetic compute = new Arithmetic();
      // Enter your code here!
      // Run some computations....
        double tip = compute.calcTip(M, T);
        double tax = compute.calcTip(M, X);
        
        double numberToRoundHere = M + tip + tax;
      
      // int total = (int) Math.round(/*numberToRoundHere*/);
        int total = (int) Math.round(numberToRoundHere);
      
      // ...then print!
      System.out.println("The final price of the meal is $"+total+".");
    }
}

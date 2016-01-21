
package interfaces;

import java.io.*;
import java.util.*;

public class Interfaces {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      	AdvancedArithmetic myCalculator=new Calculator(); 
        int sum=myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n"+sum);
    }
}

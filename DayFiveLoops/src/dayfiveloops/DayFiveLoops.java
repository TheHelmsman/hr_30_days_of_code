/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayfiveloops;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayFiveLoops {

    public static void calculateResult(int a, int b, int N) {
        
        //System.out.println("a: "+a+" b: "+b+" N: "+N);
        for(int i = 1; i <= N; i++) {
            //  loop N times
            int calcB = 0;
            for(int j = 0; j< i; j++) {
                calcB += (int)Math.pow(2, j) * b;
                //System.out.println("j: "+j+" calcB: "+calcB);
            }
            int result = a + calcB;
            System.out.print(result+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        //System.out.println("T: "+T);
        for(int i = 0; i < T; i++) {
            int a = 0;
            int b = 0;
            int N = 0;
            for(int j = 0; j < 3; j++) {
                if(j == 0) {
                    a = sc.nextInt();
                } else if(j == 1) {
                    b = sc.nextInt();
                } else {
                    N = sc.nextInt();
                }
                
            }
            //System.out.println("a: "+a+" b: "+b+" N: "+N);
            calculateResult(a, b, N);
        }
    }
}

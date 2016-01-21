
package sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];
        for(int i=0; i< N; i++) {
            list[i] = sc.nextInt();
            //System.out.println("i: "+i+" value: "+list[i]);
        }
        Arrays.sort(list);

        //abs min
        int minDifference = Math.abs(list[1] - list[0]);
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <N; i++) {
            int currentDifference = Math.abs(list[i] - list[i-1]);
            if(currentDifference < minDifference) {
                sb = new StringBuilder();
                sb.append(list[i - 1] + " " + list[i] + " ");
                minDifference = Math.min(currentDifference, minDifference);
            } else if(currentDifference == minDifference){
                sb.append(list[i - 1] + " " + list[i] + " ");
            }
        }

        System.out.println(sb.toString());
    }
    
}

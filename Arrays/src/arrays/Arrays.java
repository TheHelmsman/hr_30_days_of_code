package arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
        }
        for(int j=arr.length-1; j>=0; j--) {
            System.out.print(arr[j]);
            if(j > 0) {
                System.out.print(" ");
            }
        }
    }
}

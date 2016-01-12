package binarynumbers;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinaryNumbers {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(sc.nextLine());
            System.out.println(Integer.toBinaryString(N));
        }
    }
}

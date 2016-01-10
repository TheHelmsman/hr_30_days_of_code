package recursion;

import java.io.*;
import java.util.*;

public class Recursion {

    static int find_gcd(int a, int b) {
        //    Base Case
        if (a == b) {
            return a;
        } //   Recursive Case
        else if (a > b) {
            return find_gcd(a - b, b);
        } else {
            return find_gcd(b - a, a);
        }
    }

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Take Input
        int a = sc.nextInt();
        int b = sc.nextInt();
        //System.out.println(a+" - "+b);
        int gcd = find_gcd(a, b);
        System.out.println(gcd);
    }

}

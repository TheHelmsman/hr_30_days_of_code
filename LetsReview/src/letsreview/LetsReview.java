
package letsreview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LetsReview {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i< n; i++) {
            String l1 = "";
            String l2 = "#";
            for(int j=(n-i-1); j> 0; j--) {
                l1 += " ";
            }
            for(int x=0; x< i; x++) {
                l2 += "#";
            }
            System.out.println(l1+""+l2);
        }
    }
}

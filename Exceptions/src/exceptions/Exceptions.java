
package exceptions;

import java.util.*;
import java.io.*;


public class Exceptions {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T --> 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

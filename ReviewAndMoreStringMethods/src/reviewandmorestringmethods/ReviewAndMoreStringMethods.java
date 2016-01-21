
package reviewandmorestringmethods;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReviewAndMoreStringMethods {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String inputData = (String) sc.nextLine();
        //System.out.println(inputData);
        StringTokenizer st = new StringTokenizer(inputData, " ![,?.\\_'@+]");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}

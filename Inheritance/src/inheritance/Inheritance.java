package inheritance;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Inheritance {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        int phone=sc.nextInt();
        int score=sc.nextInt();
        Student stu=new Grade(firstName,lastName,phone,score);
        stu.display();
        Grade g=(Grade)stu;
        System.out.println("Grade: "+g.calculate());
    }
    
}

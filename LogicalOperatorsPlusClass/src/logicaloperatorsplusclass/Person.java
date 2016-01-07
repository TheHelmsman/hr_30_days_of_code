package logicaloperatorsplusclass;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Person {

    int age;

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public Person(int initial_Age) {
        // Add some more code to run some checks on initial_Age
        if (initial_Age < 0) {
            System.out.println("This person is not valid, setting age to 0.");
            setAge(0);
        } else {
            setAge(initial_Age);
        }
    }

    public void amIOld() {
        // Do some computations in here and print out the correct statement to the console 
        // using System.out.println()...
        if (getAge() < 13) {
            System.out.println("You are young.");
        } else if (getAge() >= 13 && getAge() < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        // Increment the age of the person in here
        setAge(getAge() + 1);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for(int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
    }

}

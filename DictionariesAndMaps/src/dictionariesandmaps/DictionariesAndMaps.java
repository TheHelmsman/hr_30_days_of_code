package dictionariesandmaps;

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class DictionariesAndMaps {

    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        //   number of entries in the phone book
        int N=in.nextInt();
        in.nextLine();
        //    phone book
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        for(int i=0; i<N; i++) {
            String name=in.nextLine();
            int phone=in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }
        //  print phone book
        //System.out.println(phoneBook.toString());
        while(in.hasNext()) {
            String s=in.nextLine();
            if(phoneBook.containsKey(s)) {
                System.out.println(s+"="+phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
    
}

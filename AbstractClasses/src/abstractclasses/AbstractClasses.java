package abstractclasses;

import java.util.Scanner;

public class AbstractClasses {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();
        Book new_novel=new MyBook(title,author,price);
        new_novel.display();
    }
    
}

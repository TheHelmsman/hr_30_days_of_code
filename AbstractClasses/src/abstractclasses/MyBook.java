

package abstractclasses;

class MyBook extends Book {
    
    int p;
    
    public MyBook(String t, String a, int p) {
        super(t, a);
        this.p = p;
    }
    
    public void display() {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+p);
    }
}

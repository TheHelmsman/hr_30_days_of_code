
package queuey;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queuey<D> {

    LinkedList<D> queue;
    
    //  Making a queue instance
    public Queuey() {
        queue = new LinkedList();
    }
    
    //  Is our queue empty?
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    //  What is the size of our queue?
    public int size() {
        return queue.size();
    }
    
    //  Enqueueing an item
    public void enqueue(D n) {
        queue.addLast(n);
    }
    
    //  Dequeueing an item
    public D dequeue() {
        //  cast object to int
        return queue.remove(0);
    }
    
    //  Peek at the first item
    public D peek() {
        return queue.get(0);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("hi");
        System.out.println(stacky.pop()+" ");
        System.out.println("Peek: "+stacky.peek());
        System.out.println(stacky.pop()+"! ");
        System.out.println("Size: "+stacky.size());
        
        //Queuey queue = new Queuey<>();
        
        
        Queuey stringQueue = new Queuey();
        stringQueue.enqueue("hi");
        stringQueue.enqueue("there");
        System.out.println(stringQueue.dequeue()+" ");
        System.out.println(stringQueue.dequeue()+".");
        
        
        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out: "+numberQueue.dequeue());
        System.out.println("Peek at second item: "+numberQueue.peek());
        System.out.println("Second out: "+numberQueue.dequeue());
        System.out.println("Third out: "+numberQueue.dequeue());
    }
    
}

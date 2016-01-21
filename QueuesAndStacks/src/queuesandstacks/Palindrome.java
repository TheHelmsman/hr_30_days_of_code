
package queuesandstacks;

import java.util.*;

public class Palindrome {
    
    Stack st;
    Queue queuey;
    
    //Write your code here
    public Palindrome() {
        st = new Stack();
        queuey = new LinkedList();
    }
    //  Pushes a character onto a stack
    public void pushCharacter(char ch) {
        st.push(ch);
    }
    //  Enqueues a character in a queue
    public void enqueueCharacter(char ch) {
        queuey.add(ch);
    }
    //  Pops and returns the top character from stack
    public char popCharacter() {
        return (char) st.pop();
    }
    //  Dequeues and returns the first character in q queue
    public char dequeueCharacter() {
        return (char) queuey.remove();
    }
}

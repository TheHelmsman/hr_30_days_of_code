package allaboutscope;

import java.util.Arrays;

public class Difference {
    
    private int[] elements;
    public int maximumDifference;
    
    public Difference(int[] a) {
        elements=new int[a.length];
        System.arraycopy(a, 0, elements, 0, a.length);
    }
    
    public void computeDifference() {
        Arrays.sort(elements);
        maximumDifference=elements[elements.length-1]-elements[0];
    }
}

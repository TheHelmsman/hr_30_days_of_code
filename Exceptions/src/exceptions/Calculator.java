package exceptions;

class Calculator {
    
    public int power(int n, int p) {
        double result = -1;
        if(n < 0 || p < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        } else {
            result= Math.pow((double) n, (double) p);
        }
        return (int) result;
    }
}

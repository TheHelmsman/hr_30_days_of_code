
package inheritance;

class Grade extends Student{
   private int score;
   
    public Grade(String fname, String lname, int p, int score) {
        super(fname, lname, p);
        this.score = score;
    }
    
    public int getScore() {
        return score;
    }
    
    public char calculate() {
        char grade;
        if(getScore() < 40) {
            grade = 'D';
        } else if(getScore() < 60) {
            grade = 'B';
        } else if(getScore() < 75) {
            grade = 'A';
        } else if(getScore() < 90) {
            grade = 'E';
        } else {
            grade = 'O';
        }
        return grade;
    }
}
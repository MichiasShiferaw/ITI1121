
public class Arithmetic extends AbstractSeries {

    // instance variables
    private double currentSum; //current partial sum
    private int n; //current n

    public double next() {
        // implement the method
        
        //adding n to current sum
        currentSum+=n;
        //incrementing n for next call
        n++;
        //returning current sum
        return currentSum;        
        
    }
    public Arithmetic() {
        //setting sum to 0 and n to 1
        currentSum=0;

        n=1;
    }
}

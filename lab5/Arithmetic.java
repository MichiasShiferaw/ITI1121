
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

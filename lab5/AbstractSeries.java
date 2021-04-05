
public abstract class AbstractSeries implements Series {

    public double[] take(int k) {
        //initializing the array
        double nextSums[] = new double[k];
        //using next() method, assigning next k numbers to array
        for (int i = 0; i < k; i++) {
            nextSums[i] = next();

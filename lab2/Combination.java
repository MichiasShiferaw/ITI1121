public class Combination {

    // Instance variables.
    // Remove this comment and declare your instance variables here
    private int first;
    private int second;
    private int third;

    
    // Constructor
    // note: we have to use "this" in order to distinguish
    // between the parameter first and the instance
    // variable first (similarly for second and third).

    public Combination( int first, int second, int third ) {
        // Your code here
        this.first = first;
        this.second = second;
        this.third = third;
    }
    // An instance method that compares this object
    // to other.
    // Always check that other is not null, i)
    // an error would occur if you tried to
    // access other.first if other was null, ii)
    // null is a valid argument, the method should
    // simply return false.

    public boolean equals( Combination other ) {
        // Put your code here and remove the line below
		if (other==null){
			return false;
		}
        return (( first == other.first ) &&( second == other.second ) &&( third == other.third ) );
    }

    // Returns a String representation of this Combination.
   public String toString() {

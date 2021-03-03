public class DoorLock {

      // Constant.
    public static final int MAX_NUMBER_OF_ATTEMPTS = 3;
          // Instance variables.
    private Combination combination;
    private boolean open;
    private boolean activated;
    private int numberOfAttempts;

    // Constructor.
    public DoorLock( Combination combination ) {
        // Your code here
        this.combination = combination;
        open = false;

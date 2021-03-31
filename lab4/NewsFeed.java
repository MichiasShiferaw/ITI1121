
public class NewsFeed {

    private Post[] messages;
    private int size;
    public static final int MAX_SIZE = 25;
    public NewsFeed() {
    	// Your code here.
		this.size=0;
		this.messages = new Post[MAX_SIZE];
    }


    public void add(Post message) {
		// Your code here.
		if (size == MAX_SIZE) {
		  System.out.println("Max size reached");
		  return;
		}
		this.messages[size++] = message;


    }

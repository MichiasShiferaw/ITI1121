
public class NewsFeed {

    private Post[] messages;
    private int size;
    public static final int MAX_SIZE = 25;
    public NewsFeed() {
    	// Your code here.
		this.size=0;
		this.messages = new Post[MAX_SIZE];
    }


public class Book {

    // Your variables declaration here
	
    private String author;
    private String title;

    public Book (String author, String title, int year) {
        // Your code here
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
	return author;
        // Your code here
    }

    public String getTitle() {
 	return title;
        // Your code here
    }

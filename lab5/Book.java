
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

    public int getYear() {
	return year;
        // Your code here
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        if (author==null||title==null){
            if (author!=null){
                return year == book.year && author.equals(book.author) && title==(book.title); 

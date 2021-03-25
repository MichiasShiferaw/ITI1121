
public class TextPost extends Post {
    private String message;

    
    public TextPost(String userName, String message) {
      // Your code here.
      super(userName);
      this.message=message;
    }

    public String getMessage() {
	     return message;
    } 

    public String toString() {
    	String str = new String();	

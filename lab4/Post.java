import java.util.Calendar;
import java.util.Date;

public class Post implements Likeable, Comparable<Post> {

    protected int likes;
    private Date timeStamp;
    private String userName;
    public Post(String userName) {
      likes = 0;
      timeStamp = Calendar.getInstance().getTime();
      this.userName = userName;
      // Your code here
    }

    public String getUserName() {
	    return userName;
    }

    public Date getTimeStamp() {
	    return timeStamp;
    }

    public String toString() {
    	String str = new String();
    	str = getClass().getName() + ": " + timeStamp + ", " + userName + ", likes = " + likes;
    	return  str;
    }
    public void like(){
      likes=likes+1;
    }
    public int getLikes(){
      return likes;
    }

    public int compareTo(Post other){
      return (this.timeStamp.compareTo(other.timeStamp));
  }

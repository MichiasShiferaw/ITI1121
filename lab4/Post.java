import java.util.Calendar;
import java.util.Date;

public class Post implements Likeable, Comparable<Post> {

    protected int likes;
    private Date timeStamp;
    private String userName;
    public Post(String userName) {
      likes = 0;

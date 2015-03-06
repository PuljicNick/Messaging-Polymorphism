/*
 * The Tweet class should create a Message with a content length of no
 * more than 118 characters. If the given content parameter has a length
 * greater than 118, it should be truncated (the ending cut off).
 * The recipients of a Tweet should be all followers of the sender.
 * Fix the class definition below so it behaves as described above.
 */
public class Tweet extends Message {
    private final int TWEET_SIZE = 118;

    //constructor - to be fixed in part (d)
    public Tweet(Person sender, String content) {
        super(null, sender, content);
    }
}

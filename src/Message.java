import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Message {
    private String content;
    private Person sender;
    private Person[] recipients;
    private String timeStamp;  //date and time of message sending

    //constructor
    public Message(Person[] recipients, Person sender, String content) {
        this.content = content;
        this.sender = sender;
        this.recipients = recipients;
        timeStamp = null;
    }

    //getter
    public String getContent() {
        return content;
    }

    //setter
    public void setContent(String content) {
        this.content = content;
    }

    //getter
    public Person getSender() {
        return sender;
    }

    //getter
    public String getTimeStamp() {
        return timeStamp;
    }

    //getter
    public Person[] getRecipients() {
        return recipients;
    }

    /*
     * toString method should return the type of message followed by the sender.
     * If the message has been send it should also state the date and time if sending.
     * Note that the timeStamp of a message will be null until it is sent.
     * Examples:
     *   SMS from Wendy
     *   Tweet from from Sabrina sent 25/02/2014 04:36
     */

    //part (b) - override Object's toString method here

    @Override
    public String toString() {
        String stamp = "";
        if (timeStamp != null) {
            stamp = " sent " + getTimeStamp();
        }
        return this.getClass().getName() + " from " + sender.getName() + stamp;
    }
    /*
         * Assigning the current timeStamp end then sends message to all
         * recipients by adding this Message to their unreadMessages list.
         */
    public void send() {
        timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
        for(Person person : getRecipients()){
            person.newMessage(this);
        }
        //to be implemented in part (e)
    }
}

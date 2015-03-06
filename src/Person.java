import java.util.ArrayList;

public class Person {
    //instance fields
    private String name;
    private long handPhoneNumber;
    private String email;
    private String encryptionKey;
    private ArrayList<Message> unreadMessages;
    private ArrayList<Message> readMessages;
    private Person[] followers;   //An array of followers on Twitter

    //constructor
    public Person(String name, long handPhoneNumber, String email) {
        this.name = name;
        this.handPhoneNumber = handPhoneNumber;
        this.email = email;
        this.readMessages = new ArrayList<Message>();
        this.unreadMessages = new ArrayList<Message>();
    }

    //getter methods

    public String getName() {
        return name;
    }

    public long getHandPhoneNumber() {
        return handPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getEncryptionKey() {
        return encryptionKey;
    }

    public Person[] getFollowers() {
        return followers;
    }

    //other methods below

    public void setFollowers(Person[] p) {
        followers = p;
    }

    public void setEncrytionKey(String encrytionKey) {
        this.encryptionKey = encrytionKey;
    }

    public boolean hasEncryptionKey() {
        return encryptionKey != null;
    }

    public void newMessage(Message m) {
        unreadMessages.add(m);
    }

    /*
     * Returns whether this person follows a given person on Twitter
     */
    public boolean follows(Person p) {
        //to be implemented in part (a)

        return false;
    }

    /*
     * Returns the content of the first message in the unreadMessage list.
     * It should remove the message from the unreadMessage list and move
     * it to the readMessage list.
     * If the message is a SecureEmail, call the private helper method
     * decryptMessage to dycrypt the content using this Person's encryption
     * key. Note that this method will be fully implemented in part (h)
     */
    public String readNextMessage() {
        //to be implemented in part (f)

        return null; //remove this line
    }

    /*
     * Returns an array of Strings containing the calls to
     * the toString method of all unreadMessages and readMessages
     * If a message is unread it should be preceded by an asterisk (*)
     */
    public String[] getInbox() {
        //to be implemented in part (g)

        return null; //remove this line
    }

    /*
     * Decode the content of the Message based on this Person's encryption key.
     * Analyze the encryptMessage method of the SecureEmail class and see if
     * the method can be reversed.
     */
    private String decryptMessage(String m) {

        if (encryptionKey == null)
            return m;

        //to be implemented part (h)

        return m; //remove this line
    }

    @Override
    public String toString() {
        return name;
    }
}
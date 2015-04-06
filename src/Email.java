public class Email extends Message {
    private String subject;

    //constructor
    public Email(Person[] recipients, Person sender, String subject, String content) {
        super(recipients, sender, content);
        this.subject = subject;
    }

    //getter
    public String getSubject() {
        return subject;
    }

    //setter
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /*
     * toString method should return the subject in double quotations,
     * followed by the sender and the date and time sent (if already sent)
     * Examples:
     *   "Allergy Medication Woes" from Wendy
     *   "Case Details (private)" from Bob sent 24/09/2013 12:08
     */

    //part (c) - override Object's toString method here
    @Override
    public String toString() {
        String stamp = "";
        String subject = "";
        subject ="\"" + getSubject() + "\"";
        if (getTimeStamp() != null) {
            stamp = " sent " + getTimeStamp();
        }
        return subject + " from " + getSender() + stamp;
    }
}

//no need to change this class
public class SMS extends Message {
    private final int SMS_SIZE = 160;

    public SMS(Person[] recipients, Person sender, String content) {
        super(recipients, sender, content);
        if (content.length() > SMS_SIZE)
            setContent(content.substring(0, SMS_SIZE));
    }
}

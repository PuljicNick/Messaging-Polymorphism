//no need to change this class
public class SecureEmail extends Email {
    public SecureEmail(Person[] recipients, Person sender, String subject, String content) {
        super(recipients, sender, subject, content);
    }

    @Override
    public void send() {
        encryptMessage();
        super.send();
    }

    /*
     * Encrypt the message content
     */
    private void encryptMessage() {
        String k = getSender().getEncryptionKey();
        String m = getContent();

        String encrypted = "";

        //encode each character as three digits and add to encrypted String

        for (int i = 0; i < m.length(); i++) {
            encrypted += (m.substring(i,i+1).compareTo(k.substring(i % k.length(), i % k.length() + 1)) + 228) * (i % 3 + 1);
        }

        setContent(encrypted);
    }
}

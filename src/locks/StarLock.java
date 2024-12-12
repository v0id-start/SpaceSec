package locks;
import data.Message;

/**
 * This Lock inserts stars before every character.
 * This Lock hinges on the the laziness of the average Message interceptor.
 */
public class StarLock implements Lock {


    /**
     * This Lock encrypts by adding 100 stars before every single character.
     * E.g. "hello" -> "*h*e*l*l*o" (where each star is 100 stars in a row)
     *
     * "This job makes me see stars, sometimes..."
     *      - SpaceSec Employee 413251 after 42 hours on star-watching duty.
     *
     * @param message to encrypt
     * @return new encrypted Message
     */
    public Message encrypt(Message message) {
        String originalText = message.getMessageText();
        String encryptedText = "";

        for (int i = 0; i < originalText.length(); i++) {
            for (int j = 0; j < 100; j++) {
                encryptedText += "*";
            }

            encryptedText += originalText.charAt(i);
        }

        return new Message(encryptedText);
    }

    /**
     * Undo the Star Encryption algorithm to return the text to the original.
     *
     * @param message to decrypt
     * @return new decrypted Message
     */
    public Message decrypt(Message message) {
        // TODO REPLACE THIS
        return message;
    }

    /**
     * -- PROPRIETARY SPACESEC CODE -- IGNORE AT ALL COSTS --
     */
    public String getName() {
        return "STAR LOCK";
    }

}

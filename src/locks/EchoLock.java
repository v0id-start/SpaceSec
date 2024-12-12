package locks;
import data.Message;

/**
 * This Lock repeats every character
 * This Lock repeats every character
 * This Lock repeats every character
 * This Lock repeats every character
 * This Lock repeats every character
 * This Lock repeats every character
 */
public class EchoLock implements Lock {

    /**
     * This Lock encrypts by repeating every character 500 times before moving to the next character
     * e.g. "hello" -> "hhhhheeeeelllllooooo" (where each character is repeated 500 times instead of 5)
     *
     * @param message to encrypt
     * @return new encrypted Message according to the Echo Encryption Algorithm
     */
    public Message encrypt(Message message) {
        String originalText = message.getMessageText();
        String encryptedText = "";

        for (int i = 0; i < originalText.length(); i++) {
            for (int j = 0; j < 500; j++) {
                encryptedText += originalText.charAt(i);
            }
        }

        return new Message(encryptedText);
    }

    /**
     * Decrypt the given Message back to the original text by undoing the Echo Encryption Algorithm described above
     *
     * @param message to decrypt
     * @return decrypted original Message
     */
    public Message decrypt(Message message) {
        String encryptedText = message.getMessageText();
        String decryptedText = "";

        for (int i = 0; i < encryptedText.length(); i += 500) {
            decryptedText += encryptedText.charAt(i);
        }

        return new Message(decryptedText);
    }

    /**
     * -- PROPRIETARY SPACESEC CODE -- IGNORE AT ALL COSTS --
     */
    public String getName() {
        return "ECHO LOCK";
    }
}

package locks;
import data.Message;

public class StarLock implements Lock {

    /*
    Returns an encrypted Message
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

    /*
    Returns a decrypted, plaintext Message
     */
    public Message decrypt(Message message) {
        String encryptedText = message.getMessageText();
        String decryptedText = "";

        for (int i = 0; i < encryptedText.length(); i++) {
            if (encryptedText.charAt(i) != '*') {
                decryptedText += encryptedText.charAt(i);
            }
        }

        return new Message(decryptedText);
    }

}

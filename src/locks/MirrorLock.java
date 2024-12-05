package locks;

import data.Message;

public class MirrorLock implements Lock {

    /*
    Returns an encrypted Message
     */
    public Message encrypt(Message message) {
        String originalText = message.getMessageText();
        String encryptedText = reverseString(originalText);

        return new Message(encryptedText);
    }

    /*
    Returns a decrypted, plaintext Message
     */
    public Message decrypt(Message message) {
        String encryptedText = message.getMessageText();
        String decryptedText = reverseString(encryptedText);

        return new Message(decryptedText);
    }

    private String reverseString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
}

package locks;

import data.Message;

/**
 * This lock is marginally better than the Baby Lock, encrypting by reversing the input.
 *
 * "At SpaceSec(TM), we care about your mental health.
 * That’s why our Employee Wellness Center offers complimentary sessions
 * with SpaceBot-3000, the empathy simulator. Please note that repeated
 * breakdowns during sessions may result in disciplinary action."
 *             - SpaceSec Employee Handbook Chapter 9 Subsection 8.p
 */
public class MirrorLock implements Lock {


    /**
     * This Lock encrypts Messages by reversing the Message text string, rendering it unreadable to the untrained eye.
     * Returns a new Message with the encrypted text
     *
     * @param message to encrypt
     * @return encrypted Message according to reversal encryption algorithm
     */
    public Message encrypt(Message message) {
        String originalText = message.getMessageText();
        String encryptedText = reverseString(originalText);

        return new Message(encryptedText);
    }

    /**
     * Decrypt the reversed string back to its original form, return a new Message with decrypted text.
     *
     * @param message to decrypt
     * @return decrypted, original Message
     */
    public Message decrypt(Message message) {
        String encryptedText = message.getMessageText();
        String decryptedText = reverseString(encryptedText);

        return new Message(decryptedText);
    }

    /**
     * -- PROPRIETARY SPACESEC CODE -- IGNORE AT ALL COSTS --
     */
    public String getName() {
        return "MIRROR LOCK";
    }

    /**
     * It would be nice if there was a way to reuse a repetitive algorithm that shows up more than once....
     *  Maybe one day they will add that...
     */
    private String reverseString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
}

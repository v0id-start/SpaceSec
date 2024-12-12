package locks;

import data.Message;

/**
 * "About as useful as those push-down-and-twist caps on ibuprofen. For the love of god, never actually use this lock."
 * (Yes, we have ibuprofen in space)
 *             - SpaceSec Employee Onboarding Lecture 14:35:21
 */
public class ExampleBabyLock implements Lock {

    /**
     * The Baby Lock encrypts a String by prepending the String with
     *          "Please please please do not read -> "
     * and subsequently hoping for the best. This method returns a new Message object with the encrypted String.
     *
     * @param message to encrypt
     * @return Message with encrypted text according to the Baby Encryption Algorithm
     */
    public Message encrypt(Message message) {
        // Get the message text String
        String messageText = message.getMessageText();
        String encryptedText = "";

        // Encrypt the text so that it is unreadable to the average person and needs to be decrypted
        encryptedText = "Please please please do not read -> " + messageText;

        // Return a new Message object with the encrypted text
        return new Message(encryptedText);
    }

    /**
     * Uses the sophisticated Baby Encrypt Reversal algorithm to restore the Message text back to its original form.
     * (Cuts off first 36 characters)
     * This method returns a new Message object with the decrypted String
     *
     * @param message to decrypt
     * @return Message with decrypted, original plaintext
     */
    public Message decrypt(Message message) {
        // Get the encrypted text
        String encryptedText = message.getMessageText();

        // Use a highly sophisticated decryption algorithm to return this text to its original plaintext String
        String decryptedText = encryptedText.substring(36);

        return new Message(decryptedText);
    }

    /**
     * -- PROPRIETARY SPACESEC CODE -- IGNORE AT ALL COSTS --
     */
    public String getName() {
        return "BABY LOCK";
    }
}

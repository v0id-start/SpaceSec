package locks;

import data.Message;

/**
 * "About as useful as those push-down-and-twist caps on ibuprofen. For the love of god, never actually use this lock."
 * (Yes we have ibuprofen in space)
 *             - SpaceSec Employee Handbook Chapter 1 Subsection 1.a
 */
public class ExampleBabyLock implements Lock {

    public Message encrypt(Message message) {
        // Get the message text String
        String messageText = message.getMessageText();
        String encryptedText = "";

        // Encrypt the text so that it is unreadable to the average person and needs to be decrypted
        encryptedText = "Please please please do not read -> " + messageText;

        // Return a new Message object with the encrypted text
        return new Message(encryptedText);
    }

    public Message decrypt(Message message) {
        // Get the encrypted text
        String encryptedText = message.getMessageText();

        // Use a highly sophisticated decryption algorithm to return this text to its original plaintext String
        String decryptedText = encryptedText.substring(0, 36);

        return new Message(decryptedText);
    }
}

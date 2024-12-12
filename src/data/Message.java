package data;

/**
 * A Message represents a String of text - Messages can be sent between Cryptonauts, and most importantly,
 * Messages can be encrypted and decrypted by a Lock object in order to promote security when sending between
 * Cryptonauts.
 *
 * "SpaceSec(TM) is proud to offer an extensive benefits package,
 * including free air (while on duty), complimentary gravity (on select floors),
 * and 15% off in the cafeteria on AstroBurger Wednesdays.
 * Terms and conditions apply. Benefits void during escape pod shortages."
 *             - SpaceSec Employee Handbook Chapter 7 Subsection 9.b
 */
public class Message {

    // Internal message text
    private String messageText;

    /**
     * Constructs an instance of a Message given initial message text
     *
     * @param text initial message text
     */
    public Message(String text) {
        this.messageText = text;
    }


    /**
     * "A classic getter, just like the kind Grammy used to make"
     * - a delirious SpaceSec facility worker on the 52nd hour of his shift
     *
     * @return the internal String message text from this Message
     */
    public String getMessageText() {
        return this.messageText;
    }

    /**
     * Override toString here
     * @return the message text
     */
    public String toString() {
        return this.messageText;
    }
}

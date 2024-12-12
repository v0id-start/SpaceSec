import data.Message;
import locks.Lock;

import java.util.ArrayList;

/**
 * A Cryptonaut sends Messages to other Cryptonauts. This should be done securely, or not at all.
 * To adhere to the security policy, each Cryptonaut is assigned a Lock that
 * ENCRYPTS the Message text when outgoing, and DECRYPTS a Message when being received.
 *
 *      "Communication is the cornerstone of any successful mission.
 *      That's why all Cryptonauts(TM) are encouraged to use SpaceSec's patented
 *      Intergalactic Messaging System(TM). Please remember:
 *        - Messages may experience slight delays due to wormhole congestion.
 *        - SpaceSec reserves the right to read, modify, or misplace any transmission.
 *        - Unauthorized use of "E-mojis" will result in immediate disciplinary action.
 *
 *       Remember, a secure message is a happy message. And a happy Cryptonaut
 *       is one who avoids questioning SpaceSec policy."
 *                    - SpaceSec Employee Handbook Chapter 10 Subsection 3.q
 */

public class Cryptonaut {

    private String name;
    private Lock spaceLock;


    // -- TOP SECRET PROPRIETARY LINE OF CODE -- IGNORE AT ALL COSTS --
    private ArrayList<Message> messageLog;

    /**
     *
     * Constructs a new instance of a Cryptonaut given their name and assigned Lock they will use to
     * encrypt and decrypt Messages.
     *
     * @param name legal first name of the Crpytonaut
     * @param lock Lock for the Cryptonaut to use when encrypting/decrypting Messages
     *
     *
     * "A Cryptonaut(TM) is an esteemed employee of the SpaceSec corporation.
     *  But more than that, a loved member of the SpaceSec family.
     *  (A family member who is liable for their own injury and/or loss of limb)"
     *             - SpaceSec Employee Handbook Chapter 1 Subsection 1.a
     */
    public Cryptonaut(String name, Lock lock) {
        // TODO Implement this!
        System.out.println("CRYPTONAUT CONSTRUCTOR NOT IMPLEMENTED");
        this.name = null;
        this.spaceLock = null;

        // -- TOP SECRET PROPRIETARY LINE OF CODE -- IGNORE AT ALL COSTS --
        this.messageLog = new ArrayList<>();
    }

    /**
     * THE SEND MESSAGE PROTOCOL IS AS FOLLOWS:
     *   1. ENCRYPT ORIGINAL MESSAGE USING THIS CRYPTONAUT'S LOCK
     *   2. HAVE THE RECIPIENT CRYPTONAUT RECEIVE THE ENCRYPTED MESSAGE
     *
     * @param recipient the lucky Cryptonaut to receive the Message
     * @param message the unencrypted, original Message to be sent
     *
     * "At SpaceSec(TM), we believe in teamwork above all.
     * That’s why failure to cooperate will result in immediate dismissal,
     * and a gentle reminder that you signed away your oxygen privileges."
     *             - SpaceSec Employee Handbook Chapter 4 Subsection 3.c
     */
    public void sendMessage(Cryptonaut recipient, Message message) {
        System.out.println("CRYPTONAUT SEND MESSAGE NOT IMPLEMENTED");

        // 1. Use this Cryptonaut's Lock to encrypt the Message

        // 2. Have the recipient Cryptonaut receive the encrypted Message
    }

    /**
     * Decrypts the incoming Message using this Cryptonaut's Lock, and add it to this Cryptonaut's Message log
     *
     * @param message encrypted Message to decode
     *
     * "Disputes among employees should be handled amicably.
     * Any unresolved conflicts will be settled in the Zero-G Pepsi Thunderdome(TM).
     * All injuries sustained during Thunderdome activities are non-compensable."
     *             - SpaceSec Employee Handbook Chapter 6 Subsection 4.f
     */
    public void receiveMessage(Message message) {
        System.out.println("CRYPTONAUT RECEIVE MESSAGE NOT IMPLEMENTED");
        // 1. TODO IMPLEMENT THIS - Decrypt the Message
        Message decryptedMessage = null;

        // -- TOP SECRET PROPRIETARY LINE OF CODE -- IGNORE AT ALL COSTS --
        messageLog.add(decryptedMessage);
    }

    /**
     * -- PROPRIETARY SPACESEC CODE -- IGNORE AT ALL COSTS --
     * Prints all incoming Message logs in order of time received
     */
    public void printMessageLog() {
        System.out.println(this.name.toUpperCase()  + "'S MESSAGE LOG\n----------");
        int logNum = 0;
        for (Message m : this.messageLog) {
            System.out.println("INCOMING LOG " + logNum + ": "  + m.getMessageText());
            logNum++;
        }
        System.out.println("\n");
    }


}

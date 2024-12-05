import data.Message;
import locks.Lock;

import java.util.ArrayList;

public class Cryptonaut {

    private String name;
    private Lock spaceLock;


    // IGNORE
    private ArrayList<Message> messageLog;

    /**
     *
     * @param name legal first name of the Crpytonaut
     *
     * "A Cryptonaut(TM) is an esteemed employee of the SpaceSec corporation.
     *  But more than that, a loved member of the SpaceSec family.
     *  (A family member who is liable for their own injury and/or loss of limb)"
     *             - SpaceSec Employee Handbook Chapter 1 Subsection 1.a
     */
    public Cryptonaut(String name, Lock lock) {
        // FILL OUT CONSTRUCTOR
        this.name = name;
        this.spaceLock = lock;

        // IGNORE
        this.messageLog = new ArrayList<>();
    }

    public void sendMessage(Cryptonaut recipient, Message message) {
        Message encryptedMessage = spaceLock.encrypt(message);
        recipient.receiveMessage(encryptedMessage);
    }

    public void receiveMessage(Message message) {
        Message decryptedMessage = spaceLock.decrypt(message);

        // IGNORE
        messageLog.add(decryptedMessage);
    }

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

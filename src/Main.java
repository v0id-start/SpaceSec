/**
 * (C) COPYRIGHT SPACESEC CONTRACT WORKER "INTERN"
 * ALL RIGHTS RESERVED 2025
 */

import data.Message;
import locks.*;


/**
 * Main driver class, get Space Osha incident Message logs
 *
 * "Your safety is our top priority. Please report all accidents to HR immediately.
 * Note: filing a safety report will result in an immediate review of your
 * performance and potential termination, as safety violations reflect poorly
 * on your commitment to the SpaceSec mission."
 *             - SpaceSec Employee Handbook Chapter 2 Subsection 5.a
 */
public class Main {

    public static void main(String[] args) {


        // UNCOMMENT THIS LINE TO CHECK SCORE
        IncidentMessageLoader.validateLockDecryptImpls();


        // EXAMPLE EXECUTION

        //MirrorLock lock = new MirrorLock();
        //EchoLock lock = new EchoLock();
        //StarLock lock = new StarLock();
        ExampleBabyLock lock = new ExampleBabyLock();

        Cryptonaut yoda = new Cryptonaut("Yoda", lock);
        Cryptonaut obi = new Cryptonaut("Obi", lock);

        Message secret = new Message("Obi Wan, 452 Osha violations, you have.");
        Message secret2 = new Message("Big trouble, you are in.");
        Message secret3 = new Message("A large bribe, I want.");

        Message secret4 = new Message("Please stop messaging me you have dementia and do not work for Osha.");

        // Print the encrypted value of a Message (HELPFUL FOR DEBUGGING!)
        System.out.println("Encrypted: " + lock.encrypt(secret) + "\n");

        yoda.sendMessage(obi, secret);
        yoda.sendMessage(obi, secret2);
        yoda.sendMessage(obi, secret3);

        obi.sendMessage(yoda, secret4);


        obi.printMessageLog();
        yoda.printMessageLog();
    }
}

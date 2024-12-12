import data.Message;
import locks.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

/**
 * -- PROPRIETARY SPACESEC CODE -- IGNORE AT ALL COSTS --
 */
public class IncidentMessageLoader {

    static HashMap<Integer, Integer> hashes = loadHashes();

    public static HashMap<Integer, Integer> loadHashes() {
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(1, 394030736);
        h.put(2, -942239019);
        h.put(3, -353806448);

        h.put(4, 1623434852);
        h.put(5, 1191301010);
        h.put(6, 2056658817);

        h.put(7, 2121036545);
        h.put(8, -1124555079);
        h.put(9, -774019579);

        h.put(10, 1054180571);

        return h;
    }

    public static void validateLockDecryptImpls() {
        Lock e = new EchoLock();
        Lock b = new ExampleBabyLock();
        Lock m = new MirrorLock();
        Lock s = new StarLock();
        Lock curLock = e;

        int score = 0;

        for (int i = 1; i < 11; i++) {
            String content;
            try {
                // Specify the path to your text file
                content = new String(Files.readAllBytes(Paths.get("src/message_files/incident_" + i + ".txt")));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            if (i < 4) curLock = e;
            else if (i < 7) curLock = m;
            else if (i < 10) curLock = s;
            else curLock = b;

            Message enc_msg = new Message(content);
            Message dec_msg = curLock.decrypt(enc_msg);

            if (dec_msg.toString().hashCode() == hashes.get(i)) {
                System.out.println("CORRECT IMPLEMENTATION OF " + curLock.getName() + "\n");
                score++;
            } else {
                System.out.println("WRONG IMPLEMENTATION OF " + curLock.getName() + ", PLEASE CHECK YOUR IMPLEMENTATION");
            }
            System.out.println("Decrypted Osha Violation Log:\n\n" + dec_msg);
            System.out.println("\n\n\n---------------------");

        }

        System.out.println("FINAL SCORE: " + score + " / 10\n---------------------");
        System.out.println("\n\n\n");




    }

}

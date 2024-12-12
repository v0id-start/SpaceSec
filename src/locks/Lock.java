package locks;
import data.Message;

/**
 *  -- PROPRIETARY SPACESEC CODE -- IGNORE AT ALL COSTS -- .... OR DON'T :) --
 *
 *  Defines interface for all Locks
 *  a Lock must
 *      - encrypt
 *      - decrypt
 */
public interface Lock {


    /**
     * Use a chosen "encryption" algorithm to render a String unable to be read, but with a reversible procedure
     * to re-obtain the original Message text
     *
     * @param msg to encrypt
     * @return newly encrypted Message
     */
    Message encrypt(Message msg);

    /**
     * Use a chosen "decryption" algorithm to reverse the encryption done with Lock.encrypt in order to restore
     * the original plaintext
     *
     * @param msg to decrypt
     * @return newly decrypted Message
     */
    Message decrypt(Message msg);

    /**
     * @return Name of the lock, enough said!
     */
    String getName();
}

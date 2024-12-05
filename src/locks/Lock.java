package locks;
import data.Message;

public interface Lock {

    Message encrypt(Message msg);

    Message decrypt(Message msg);
}

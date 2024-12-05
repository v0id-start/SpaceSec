import data.Message;
import locks.EchoLock;
import locks.MirrorLock;
import locks.StarLock;

public class Main {

    public static void main(String[] args) {

        //MirrorLock lock = new locks.MirrorLock();
        //EchoLock lock = new EchoLock();
        StarLock lock = new StarLock();

        Cryptonaut worker1 = new Cryptonaut("Yoda", lock);
        Cryptonaut worker2 = new Cryptonaut("Obi", lock);

        Message secret = new Message("Hello Obi wan. I love you.");
        Message secret2 = new Message("Please text me back");
        Message secret3 = new Message("...ok");

        Message secret4 = new Message("Please stop messaging me.");

        worker1.sendMessage(worker2, secret);
        worker1.sendMessage(worker2, secret2);
        worker1.sendMessage(worker2, secret3);

        worker2.sendMessage(worker1, secret4);



        worker2.printMessageLog();
        worker1.printMessageLog();
    }
}

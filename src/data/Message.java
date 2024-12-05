package data;

public class Message {


    private String messageText;

    public Message(String text) {
        this.messageText = text;
    }

    public void setMessageText(String newText) {
        this.messageText = newText;
    }

    public String getMessageText() {
        return this.messageText;
    }
}

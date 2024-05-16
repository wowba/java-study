package java_basic.poly.ex1;

public class ExMain {
    public static void main(String[] args) {
        SmsSender smsSender = new SmsSender();
        EmailSender emailSender = new EmailSender();
        FaceBookSender facebookSender = new FaceBookSender();

        Sender[] senders = {smsSender, emailSender, facebookSender};
        for (Sender sender : senders) {
            sender.sendMessage("Hello World");
        }
    }
}

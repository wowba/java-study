package java_basic.poly.ex1;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS를 발송합니다 : " + message);
    }
}

package poly.ex.sender;

public class SmsSender implements Sender{
    @Override
    public void senderMessage(String message) {
        System.out.print("SMS를 발송합니다 : " + message);
        System.out.println();
    }
}

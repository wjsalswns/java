package poly.ex.sender;

public class FaceBookSender implements Sender{
    @Override
    public void senderMessage(String message) {
        System.out.print("페이스북에 발송합니다 : " + message);
        System.out.println();
    }
}

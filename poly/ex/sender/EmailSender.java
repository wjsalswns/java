package poly.ex.sender;

public class EmailSender implements Sender{
    @Override
    public void senderMessage(String message) {
        System.out.print("메일을 발송합니다 : " + message);
        System.out.println();
    }
}

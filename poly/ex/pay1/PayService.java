package poly.ex.pay1;

public class PayService{
    public void processPay(String option, int amount) {
        System.out.printf("결제를 시작합니다 option = %s, amount = %d", option, amount);
        System.out.println();

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if(result){
            System.out.println("결제를 성공했습니다.");
        } else {
            System.out.println("결제를 실패했습니다.");
        }
    }
}

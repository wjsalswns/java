package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("결제 수단을 입력하세요. : ");
            String option = sc.next();
            System.out.println(option);
            if(option.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.print("결제 금액을 입력하세요. : ");
            int amount = sc.nextInt();
            System.out.println(amount);
            System.out.printf("결제를 시작합니다. : option = %s, amount %d", option, amount);
            System.out.println();
            System.out.println(option + "pay 시스템과 연결합니다. \n" + amount + "결제를 시도합니다.");
            System.out.println("결제를 성공했습니다.");

        }

    }
}

/*
실행 예시
결제 수단을 입력하세요. : kakao
결제 금액을 입력하세요. : 5000
결제를 시작합니다. : option = kakao, amount = 5000
카카오페이 시스템과 연결합니다.
5000원 결제를 시도합니다.
결제를 성공했습니다.
결제 수단을 입력하세요. : exit
프로그램을 종료합니다.
 */
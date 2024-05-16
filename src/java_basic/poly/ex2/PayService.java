package java_basic.poly.ex2;

public class PayService {
    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다.");

        boolean result = false;
        Pay pay;
        if (option.equals("kakao")) {
            pay = new KakaoPay();
        } else if (option.equals("naver")) {
            pay = new NaverPay();
        } else {
            pay = null;
            System.out.println("잘못된 결제수단 입니다");
        }

        if (pay != null) {
            result = pay.pay(amount);
        }

        if (result) {
            System.out.println("결제 성공");
        } else {
            System.out.println("결제 실패");
        }
    }
}

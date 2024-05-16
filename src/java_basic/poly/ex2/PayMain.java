package java_basic.poly.ex2;

public class PayMain {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // kakao
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        // naver
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        // wrong option
        String payOption3 = "wrong";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
    }
}

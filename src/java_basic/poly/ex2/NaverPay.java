package java_basic.poly.ex2;

public class NaverPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("네이버페이와 연결");
        System.out.println(amount + "원 결제를 시도합니다");
        return true;
    }
}

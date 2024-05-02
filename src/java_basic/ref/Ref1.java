package java_basic.ref;

public class Ref1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a; // a 변수의 값은 복사해서 b에 할당.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a 변경
        a = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b); // b는 변하지 않음

        // b 변경
        b = 30;
        System.out.println("a = " + a); // a는 변하지 않음
        System.out.println("b = " + b);
    }
}

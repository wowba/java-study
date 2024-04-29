package java_basic.method;

public class Method {
    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println(result);

        printStart();
        System.out.println(odd(1));

        // 자바는 항상 변수의 값을 복사해서 대입한다.
        int num1 = 10;
        int num2 = num1; // num1의 값을 복사해서 num2에 대입
        num2 = 5;
        System.out.println(num1); // 10

        doubleNum(num2); // 10
        System.out.println(num2); // 5

        int num3 = 10;
        getDouble(num3); // 메서드 또한 자동 형변환이 발생한다.
    }

    public static int add(int a, int b) { // 메서드 선언
        return a + b; // 메서드 본문
    }
    // public -> 다른 클래스에서 호출 가능한 메서드
    // static -> 객체를 생성하지 않고 호출할 수 있는 정적 메서드
    // int -> 메서드의 반환값 타입
    // add -> 메서드 이름

    public static void printStart() { // void => 반환타입 없음
        System.out.println("Start");
        return; // 반환타입이 void면 셍략 가능
    }

    public static boolean odd(int i) {
        if (i % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void doubleNum(int i) {
        i = i * 2; // 인자로 받은 값을 사용하는게 아니라, int i는 인자로 받은 값을 복사한 것
        // 따라서 int i가 변경되는 것이지, 인자로 받은 값 자체를 변경하지 않는다.
        System.out.println(i);
    }

    public static void getDouble(double d) {
        System.out.println(d);
    }
}

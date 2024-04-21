package java_basic.operator;

public class Operator {
    public static void main(String[] args) {
        // 사칙연산
        int a = 3;
        int b = 2;

        int sum = a + b;
        System.out.println(sum);
        int minus = a - b;
        System.out.println(minus);
        int multi = a * b;
        System.out.println(multi);
        int div = a / b;
        System.out.println(div);
        int mod = a % b;
        System.out.println(mod);

        // 문자열
        String str1 = "hello";
        String str2 = "world";
        System.out.println(str1 + str2);

        // 숫자열 자동 형변환
        int c = 3;
        System.out.println(str1 + c); // 형변환 동작 (숫자 -> 문자열)

        // 연산자 우선순위
        int d = 1 + (2 + 3) * (4 * 5);
        // 괄호가 곱셈보다 우선순위가 높다.
        System.out.println(d);

        // 증감 연산자
        int e = 1;
        ++e;
        System.out.println(e);

        // 비교연산자
        int f = 5;
        int g = 4;
        System.out.println(f == g);
        System.out.println(f != g);
        System.out.println(f > g);
        System.out.println(f < g);
        System.out.println(f <= g);
        System.out.println(f >= g);

        // 문자열 비교. 문자열은 equals 메서드를 사용해야 한다.
        String str3 = "hello";
        String str4 = "hello";
        System.out.println(str3.equals(str4));

        // 논리 연산자
        System.out.println(true && true);
        System.out.println(true || false);
        System.out.println(false && true);
    }
}

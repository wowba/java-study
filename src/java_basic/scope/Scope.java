package java_basic.scope;

public class Scope {
    public static void main(String[] args) {
        int m = 10; // m 스코프 시작, main 블럭 내에서만 존재함
        if (true) {
            int n = 10; // n 스코프 시작, if 구문 내에서만 접근 가능
            // n 스코프 종료.
        }
        System.out.println(m); // 10
        // System.out.println(n); 스코브 밖에서는 접근 불가. 에러 발생
    } // m 스코프 종료
}

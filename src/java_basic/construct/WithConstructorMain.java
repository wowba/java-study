package java_basic.construct;

public class WithConstructorMain {
    public static void main(String[] args) {
        // 생성자를 이용하면 한줄에 객체를 선언 및 기본값을 할당할 수 있다.
        // 생성자를 이용할 경우, 혹시 모를 컴파일 오류를 미리 잡을 수 있다.
        WithConstructor constructor = new WithConstructor("asdf", 20);

        WithConstructor constructor1 = new WithConstructor();
    }
}

package java_basic.construct;

public class WithConstructor {
    String name;
    int age;

    // 생성자 사용하기
    // 생성자는 Class의 이름과 동일해야 한다.
    // 생성자를 클래스 내에 정의하지 않는다면 기본생성자를 호출할 수 있다. 만약 생성자가 하나라도 있으면 기본 생성자를 만들지 않는다.
    WithConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드 오버로딩을 이용해 생성자를 여러개 만들 수 있다.
    WithConstructor() {
        // this()를 이용하면 생성자함수 내부에서 자기 자신의 생성자를 호출할 수 있다.
        // 하지만 this()는 생성자 코드의 첫줄에만 적용할 수 있다.
        this("기본 생성자", 1);
    }
}

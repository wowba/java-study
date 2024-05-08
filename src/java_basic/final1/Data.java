package java_basic.final1;

public class Data {
    // final이 붙은 멤버 변수는 반드시 생성자를 통해 지정해줘야 한다.
    final int value;

    // 초기값을 할당한 경우에는 추후 변경할 수 없다.
    final String name = "kim";

    // 결국 변경할 수 없는 변수는 공통으로 사용될 것이기 때문에
    // final + 필드 초기화의 경우 메모리를 절약하기 위해 static final로 선언하는 것이 좋다.
    // 자바에서는 이러한 상수를 선언할 때 static final 키워드를 사용한다.
    // 상수에는 대문자만을 쓰는것이 관례
    public static final int NUMBER_NUMBER = 10;

    public Data(int value) {
        this.value = value;
    }
}

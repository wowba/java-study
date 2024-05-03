package java_basic.oop;

public class ValueData {
    int value;

    // 클래스 내에서 선언한 메서드는 static 키워드가 필요없다.
    // static 키워드는 클래스를 선언하지 않고 메서드를 사용할 때 필요하다.
    void add() {
        value++;
        System.out.println("current value is: " + value);
    }
}

package java_basic.poly.interface1;

public interface Animal {

    // 멤버 변수는 public static final 로 선언한다.
    public static final int CONSTANT_NUM = 1;
    // public static final은 생략 가능하다.
    String CONSTANT_NAME = "name";

    public abstract void sound();
    // 인터페이스 내에서 public abstract는 생략할 수 있으며, 생략을 권장한다.
    void move();
}

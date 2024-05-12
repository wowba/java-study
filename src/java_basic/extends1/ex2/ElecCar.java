package java_basic.extends1.ex2;

public class ElecCar extends Car {

    public ElecCar() {
        super(); // 기본 생성자(부모 생성자)가 인자를 받지 않는 경우 생략 가능
    }

    public void charge() {
        System.out.println("charge car");
    }

    // 부모에게서 상속받은 메서드 오버라이딩
    // 이 애노테이션은 상위 클래스의 메서드를 오버라이드 하는 것을 의미한다.
    // 컴파일러는 위 애노테이션을 보고 메서드가 정확히 오버라이드 되었는지 확인한다.
    @Override
    public void move() {
        super.move(); // super를 이용해 부모를 참조할 수 있다.
        System.out.println("전기차는 빠르게 움직입니다.");
    }
}

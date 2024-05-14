package java_basic.poly.interface2;

public class Implemenet implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("methodA");
    }

    @Override
    public void methodB() {
        System.out.println("methodB");
    }

    // 두 인터페이스에서 추상 메서드로 선언된 것을 구현하기 때문에
    // 인터페이스는 다중 상속이 가능하다
    @Override
    public void methodC() {
        System.out.println("methodC");
    }


}

package java_basic.poly.basic;

public class Child extends Parent{

    public String value = "Child";

    public void childMethod() {
        System.out.println("Child.childMethod");
    }

    // 오버라이딩 된 메서드는 우선권을 가진다.
    @Override
    public void overrideMethod() {
        System.out.println("child override method");
    }
}

package java_basic.access.a;

public class AccessData {
    // public -> 모든 패키지에서 호출 가능
    // default -> 같은 패키지에서 호출 가능
    // private -> 클래스 내부에서만 호출 가능
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod : " + publicField );
    }

    void defaultMethod() {
        System.out.println("defaultMethod : " + defaultField );
    }

    private void privateMethod() {
        System.out.println("privateMethod : " + privateField );
    }

    // 내부 필드에 접근할 수 있는 메서드는 public을 이용할 수 있다.
    public void innerMethod() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}

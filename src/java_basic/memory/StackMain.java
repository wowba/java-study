package java_basic.memory;

public class StackMain {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("metho1 start");
        method2();
        System.out.println("metho1 end");
    }

    static void method2() {
        System.out.println("metho2 start");
        System.out.println("metho2 end");
    }
}

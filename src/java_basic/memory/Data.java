package java_basic.memory;

public class Data {
    private int value;
    // static 으로 선언한 멤버 변수는 모든 인스턴스에서 공유한다.
    // 즉, 클래스와 같이 메서드 영역에서 관리된다.
    // 주료 여러 인스턴스에서 공유해서 사용하기 위한 목적으로 사용한다.
    public static int count;

    public Data(int value) {
        this.value = value;
        count++;
    }

    public int getCount() {
        return count; // 인스턴스 메서드에서는 스태틱 변수에 접근할 수 있다.
    }

    public static void printCount() {
        System.out.println(count);
        // System.out.println(value); 스태틱 메서드는 스태틱 변수만 사용할 수 있다.
        // getCount(); 스테틱 메서드는 인스턴스 메서드를 호출할 수 없다.
    }
}

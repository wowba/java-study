package java_basic.poly.expert;

// 추상 클래스로 만들게 되면 이를 상속받는 하위 클래스는 반드시 추상 메서드를 오버라이딩 해야 한다.
public abstract class Animal {
    
    // 추상 메서드
    public abstract void sound();
    // 일반 메서드
    public void move() {
        System.out.println("동물 움직임");
    }
}

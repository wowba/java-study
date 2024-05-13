package java_basic.poly.basic;

public class BasicMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        // 메모리 상에 부모 인스턴스만 존재
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        // 메모리 상에 자식, 부모 인스턴스 생성
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        // 자식 타입인 Child를 생성했기 때문에 메모리 상에 두 인스턴스 모두 생성
        // 생성된 참조값을 Parent 타입의 변수인 poly에 담아둔다.
        // 즉, 자바에서 부모는 자식 타입을 담을 수 있다.
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod(); 단 자식의 메서드는 호출할 수 없다. 메서드를 찾는것은 자식 방향으로 불가능하다.
        // 이때 childMethod를 호출하려면 캐스팅이 필요하다.

        // Child child1 = new Parent(); 자식은 부모를 담을 수 없음.

        // 멤버 변수와 메서드 오버라이딩
        System.out.println("멤버 변수 비교"); // 다형적 참조시 멤버 변수 오버라이드 불가
        System.out.println("Parent value = " + parent.value);
        System.out.println("Child value = " + child.value);
        System.out.println("오버라이딩 확인");
        poly.overrideMethod(); // 다형적 참조시 메서드 오버라이드 가능
        // 오버라이딩 된 메서드는 우선권을 가지기 때문에 다형적 참조시
        // 오버라이드 된 메서드를 우선적으로 사용한다.

    }
}

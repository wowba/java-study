package java_basic.poly.basic;

public class CastingMain {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 자식 메서드를 호출하기 위한 부모 -> 자식 다운 캐스팅
        System.out.println("다운 캐스팅");
        Child child = (Child) poly;
        child.childMethod();
        child.parentMethod();
        
        // 일시적 다운 캐스팅
        // 별도의 변수 없이 인스턴스의 자식 타입의 기능을 사용할 수 있다.
        System.out.println("일시적 다운 캐스팅");
        ((Child) poly).parentMethod();

        // 업 캐스팅
        Child child2 = new Child();
        Parent parent1 = (Parent) child2; // 업 캐스팅은 생략 가능, 생략 권장
        Parent parent2 = child2;

        // instanceof
        System.out.println("instance of를 이용해 타입 확인");
        Parent parent3 = new Parent();
        checkInstance(parent3);
        Parent parent4 = new Child();
        checkInstance(parent4);
    }
    
    private static void checkInstance(Parent parent) {
        if (parent instanceof Child child) { // 인스턴스 확인과 변수 선언을 동시에
            // 이를 활용하면 직접 다운캐스팅 하는 코드를 줄일 수 있다.
            System.out.println("instance of Child");
            child.childMethod();
        }
    }
}

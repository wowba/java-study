package java_basic.ref;

public class Ref3 {
    public static void main(String[] args) {
        // 기본형을 메서드의 매개변수로 사용
        int a = 10;
        System.out.println(a); // 10
        changePrim(a);
        // 메서드를 호출한 뒤지만, 메서드에 들어간 변수는 새로 복사되어서 사용되기 때문에 원본에 영향을 미치지 않는다.
        System.out.println(a); // 10

        // 참조형을 메서드의 매개변수로 사용
        Data data = new Data();
        data.value = 10;
        changeRef(data);
        // 메서드에 객체의 주솟값을 넣었기 때문에, 메서드 내에서 주소값으로 객체에 직접 접근해 값을 변경한다.
        System.out.println(data.value); // 30
        // 하지만 객체의 속성인 기본형을 넣는 경우, 바뀌지 않는다
        changePrim(data.value);
        System.out.println(data.value); // 30
    }

    static void changePrim(int x) {
        x = 20;
    }

    static void changeRef(Data data) { // 메서드로 참조형 데이터를 전달하면 참조값이 복사되어 전달된다.
        data.value = 30;
    }

    static class Data {
        int value;
    }
}

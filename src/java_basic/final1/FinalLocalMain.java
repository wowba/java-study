package java_basic.final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 키워드는 할당 이후 변경 금지
        final int data1 = 10;
        // data1 = 20; 재할당 불가

        // 참조데이터의 경우 참조값은 못바꾸지만 참조값에 접근해 값을 변경할 수 있다.
        final Data data = new Data(10);
        // data = new Data(20); 재할당은 불가능
        data.value = 100; // 참조값에 접근해 내부 값은 변경 가능
    }

    static class Data {
        int value;

        Data(int value) {
            this.value = value;
        }
    }
}
